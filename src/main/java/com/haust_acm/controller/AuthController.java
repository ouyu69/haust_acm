package com.haust_acm.controller;

import com.haust_acm.entity.constants.Constants;
import com.haust_acm.entity.dto.account.LoginRequest;
import com.haust_acm.entity.po.User;
import com.haust_acm.enums.ResponseCodeEnum;
import com.haust_acm.enums.UserStatusEnum;
import com.haust_acm.exception.BusinessException;
import com.haust_acm.utils.CreateImageCode;
import com.haust_acm.entity.query.UserQuery;
import com.haust_acm.entity.vo.ResponseVO;
import com.haust_acm.service.UserService;
import com.haust_acm.utils.JwtUtil;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @FileName AuthController
 * @Description
 * @Author ouyu
 * @Date 2025-09-16
 **/
@RestController
@RequestMapping("/auth")
public class AuthController extends ABaseController{
    @Resource
    private UserService userService;
    @Resource
    private JwtUtil jwtUtil;
    @RequestMapping("getCheckCode")
    public void getCheckCode(HttpServletResponse response, HttpSession session,Integer type) throws IOException {
        CreateImageCode vCode = new CreateImageCode(130, 38, 4, 10) ;
        response.setHeader("Pragma","no-cache");
        response.setHeader("Cache-Control","no-cache");
        response.setDateHeader("Expires",0);
        response.setContentType("image/jpeg");
        String code = vCode.getCode() ;
        if(type == null || type == 0){
            session.setMaxInactiveInterval(5 * 60);
            session.setAttribute(Constants.CHECK_CODE_KEY,code);
        }else{
            session.setMaxInactiveInterval(5 * 60);
            session.setAttribute(Constants.CHECK_CODE_KEY_EMAIL,code);
        }
        vCode.write(response.getOutputStream());
    }

    @RequestMapping("login")
    public ResponseVO login(@RequestBody LoginRequest request,  HttpServletResponse response,HttpSession  session) throws BusinessException {
        String sessionCheckCode = (String) session.getAttribute(Constants.CHECK_CODE_KEY);
        if(sessionCheckCode == null){
            throw new BusinessException("验证码已过期，请重新获取");
        }
        if(!sessionCheckCode.equals(request.getCheckCode().toLowerCase())){
            throw new BusinessException("验证码错误", ResponseCodeEnum.CODE_600.getCode());
        }
        UserQuery query = new UserQuery();
        query.setEmail(request.getEmail());
        query.setPassword(request.getPassword());
        User user = userService.getUserByEmail(query.getEmail());
        if(user == null ){
            throw new BusinessException("邮箱不存在", ResponseCodeEnum.CODE_601.getCode());
        }else if(!Objects.equals(user.getStatus(), UserStatusEnum.NORMAL.getCode())){
            throw new BusinessException("账号处于封禁状态", ResponseCodeEnum.CODE_601.getCode());
        }else if(!Objects.equals(user.getPassword(), query.getPassword())){
            throw new BusinessException("密码错误", ResponseCodeEnum.CODE_601.getCode());
        }
        String token = jwtUtil.generateToken(user);
        Cookie cookie = new Cookie("jwt_token", token);
        response.addCookie(cookie);
        return getSuccessResponseVO(null,"登录成功");
    }
}

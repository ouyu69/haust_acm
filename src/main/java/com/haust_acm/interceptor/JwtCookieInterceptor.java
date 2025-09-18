package com.haust_acm.interceptor;

import com.haust_acm.enums.ResponseCodeEnum;
import com.haust_acm.utils.JwtUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @FileName JwtCookieInterceptor
 * @Description
 * @Author ouyu
 * @Date 2025-09-17
 **/
@Component
public class JwtCookieInterceptor implements HandlerInterceptor {

    @Resource
    private JwtUtil jwtUtil;
    Logger log = LoggerFactory.getLogger(JwtCookieInterceptor.class);

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.toString();
        log.info("获取到的url路径为：{}",url);
        //判断url路径中是否存在login，存在则说明是登录操作放行
        if(url.contains("login")||url.contains("register")||url.contains("getCheckCode")){
            log.info("当前是登录操作或获取验证码，放行。。。");
            return true;
        }
        // 从Cookie中获取JWT token
        String token = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("jwt_token".equals(cookie.getName())) {
                    token = cookie.getValue();
                    break;
                }
            }
        }

        // 如果没有token，返回未授权错误
        if (token == null || token.isEmpty()) {
            log.info("当前token为空，返回未登录信息");
            response.setStatus(ResponseCodeEnum.CODE_401.getCode());
            response.getWriter().write("{\"code\":401,\"info\":\"未登录，请先登录\"}");
            return false;
        }

        // 验证token
        try {
            jwtUtil.parseToken(token);
        } catch (Exception e) {
            response.setStatus(ResponseCodeEnum.CODE_401.getCode());
            response.getWriter().write("{\"code\":401,\"info\":\"Token无效，请重新登录\"}");
            return false;
        }
        log.info("令牌合法，成功登录放行");
        return true;
    }
}

package com.haust_acm.interceptor;

import com.haust_acm.enums.ResponseCodeEnum;
import com.haust_acm.utils.JwtUtil;
import io.jsonwebtoken.Claims;
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

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
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
            response.setStatus(ResponseCodeEnum.CODE_401.getCode());
            response.getWriter().write("{\"code\":401,\"info\":\"未登录，请先登录\"}");
            return false;
        }

        // 验证token
        try {
            Claims claims = jwtUtil.parseToken(token);
            if (claims == null) {
                response.setStatus(ResponseCodeEnum.CODE_401.getCode());
                response.getWriter().write("{\"code\":401,\"info\":\"登录已过期，请重新登录\"}");
                return false;
            }

            // 将用户信息存入request，供后续使用
            request.setAttribute("userId", Long.valueOf(claims.getSubject()));
            request.setAttribute("userEmail", claims.get("email"));
            request.setAttribute("userName", claims.get("username"));

            return true;
        } catch (Exception e) {
            response.setStatus(ResponseCodeEnum.CODE_401.getCode());
            response.getWriter().write("{\"code\":401,\"info\":\"Token无效，请重新登录\"}");
            return false;
        }
    }
}

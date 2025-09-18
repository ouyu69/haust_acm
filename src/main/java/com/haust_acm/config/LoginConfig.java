package com.haust_acm.config;

/**
 * @FileName LoginConfig
 * @Description
 * @Author ouyu
 * @Date 2025-09-17
 **/

import com.haust_acm.interceptor.JwtCookieInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class LoginConfig implements WebMvcConfigurer {

    @Resource
    private JwtCookieInterceptor jwtCookieInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册JWT Cookie拦截器
//        registry.addInterceptor(jwtCookieInterceptor)
//                .addPathPatterns("/**") // 拦截所有/api开头的请求
//                .excludePathPatterns("/auth/**"); // 排除登录接口

        // 其他拦截器...
    }
}

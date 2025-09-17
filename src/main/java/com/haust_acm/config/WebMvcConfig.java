package com.haust_acm.config;

/**
 * @FileName WebMvcConfig
 * @Description
 * @Author ouyu
 * @Date 2025-09-17
 **/

import com.haust_acm.interceptor.JwtCookieInterceptor;
import com.haust_acm.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Resource
    private JwtCookieInterceptor jwtCookieInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册JWT Cookie拦截器
        registry.addInterceptor(jwtCookieInterceptor)
                .addPathPatterns("/api/**") // 拦截所有/api开头的请求
                .excludePathPatterns("/api/auth/login") // 排除登录接口
                .excludePathPatterns("/api/auth/getCheckCode") // 排除验证码接口
                .excludePathPatterns("/api/test/**"); // 排除测试接口

        // 其他拦截器...
    }
}

package com.august.hang_around.config;

import com.august.hang_around.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author 战神
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Resource
    LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(
                        "/redis/**",
                        "/api/v1/user/login",
                        "/api/v1/user/register",
                        "/api/v1/user/logout/**",
                        "/api/v1/goods/goodsInfo",
                        "/api/v1/goods/goodsInfoDesc",
                        "/api/v1/goods/searchInfo"
                );

    }
}

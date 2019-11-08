package com.zgc.config;

import com.zgc.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
//没加上面的注解，就会不成功
public class MvcConfig implements WebMvcConfigurer  {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        拦截器
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }
}

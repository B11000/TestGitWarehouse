package com.example.springjpa.config;

import com.example.springjpa.interceptor.Interceptor_2Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * ／－－－－▼---------◅▹　◆　◃▻----------▼－－－＼
 * 　@Author-------: B_11000··················
 * 　@CreationDate-: 2023-10-09 20:07:22······
 * 　@Version------: 0.0.0····················
 * ＼－－－－▲---------◅▹　◆　◃▻----------▲－－－｜
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry_a) {
        registry_a.addInterceptor(new Interceptor_2Interceptor())
                .addPathPatterns("/index");
                 // 添加拦截路径规则
                 // .addPathPatterns("/**")
                // 排除路径
                //.excludePathPatterns("/A/1");
    }
}

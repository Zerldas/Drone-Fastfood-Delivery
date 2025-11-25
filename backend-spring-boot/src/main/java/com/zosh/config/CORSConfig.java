package com.zosh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // tất cả endpoint
                        .allowedOrigins("https://drone-fastfood-delivery-demo.vercel.app") // URL frontend
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // phương thức cho phép
                        .allowCredentials(true) // nếu cần cookie
                		.allowedOrigins("*");
            }
        };
    }
}
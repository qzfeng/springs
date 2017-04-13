package com.studying.demo;

import com.studying.aspect.AspectAnnotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by fengqz on 2017-4-6.
 */
@Configuration
@ComponentScan("com.studying.demo")
@EnableAspectJAutoProxy
public class DemoConfig {
    @Bean
    public AspectAnnotation aspectAnnotation() {
        return new AspectAnnotation();
    }
}

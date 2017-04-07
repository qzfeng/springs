package com.studying.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fengqz on 2017-4-7.
 */
@Configuration
public class CDConfig {
    // 非自动扫描组件时，需手动声明Bean
    @Bean
    public SgtPeppers sgtPeppers() {
        return new SgtPeppers();
    }

}

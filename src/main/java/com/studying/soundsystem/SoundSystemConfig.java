package com.studying.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fengqz on 2017-4-6.
 */
@Configuration
//@ComponentScan(basePackages = "com.studying.soundsystem")
public class SoundSystemConfig {
    // 非自动扫描时，需手动声明Bean
    @Bean
    public SgtPeppers sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean(name = "cdPlayer")
    public MediaPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
}


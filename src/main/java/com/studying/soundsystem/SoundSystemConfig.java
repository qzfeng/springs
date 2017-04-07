package com.studying.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by fengqz on 2017-4-6.
 */
@Configuration
// 自动扫描组件
//@ComponentScan(basePackages = "com.studying.soundsystem")
@Import({CDConfig.class,MediaConfig.class})
public class SoundSystemConfig {
}


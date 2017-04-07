package com.studying.soundsystem;

import org.springframework.context.annotation.*;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by fengqz on 2017-4-7.
 */
@Configuration
@Profile("test")
public class MediaConfig {
    // 非自动扫描组件时，需手动声明Bean
    @Bean(name = "cdPlayer")
    @Conditional(Magic.class)
    @Scope(value = WebApplicationContext.SCOPE_SESSION,proxyMode = ScopedProxyMode.INTERFACES)
    public MediaPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}

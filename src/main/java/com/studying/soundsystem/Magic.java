package com.studying.soundsystem;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by fengqz on 2017-4-7.
 */
public class Magic implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        // 判断系统中是否定义了名为“JAVA_HOME”的环境变量
        boolean containsProperty = environment.containsProperty("JAVA_HOME");
        return containsProperty;
    }
}

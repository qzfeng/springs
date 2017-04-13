package com.studying.demo;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// java方式配置
@ContextConfiguration(classes = DemoConfig.class)
// xml方式配置
//@ContextConfiguration("classpath:spring-config.xml")
public class SpringAppTests {
    @Autowired
    private HelloService helloService;

    @Test
    public void testSayHello() {
        String actual = helloService.sayHello();
        Assert.assertEquals("Hello world!", actual);
    }
}

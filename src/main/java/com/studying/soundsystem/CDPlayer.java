package com.studying.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Autowired 注解不仅能够用在构造器上，还能用在属性的setter方法上
 * Created by fengqz on 2017-4-6.
 */
//@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play(Integer trackNo) {
        compactDisc.play(trackNo);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        MediaPlayer cdPlayer = (MediaPlayer) context.getBean("cdPlayer");
        cdPlayer.play(1);
    }
}

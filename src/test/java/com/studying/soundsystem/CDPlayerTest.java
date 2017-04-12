package com.studying.soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by fengqz on 2017-4-6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = SoundSystemConfig.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
@ActiveProfiles("test")
public class CDPlayerTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();
    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void testPlay() throws Exception {
        mediaPlayer.play(1);
        mediaPlayer.play(2);
        mediaPlayer.play(1);
        mediaPlayer.play(1);
//        assertEquals("Playing Sgt.Pepper's Lonely Hearts Club Band by The Beatles\r\n",log.getLog());
    }
}
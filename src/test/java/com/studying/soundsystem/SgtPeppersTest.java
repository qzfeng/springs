package com.studying.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by fengqz on 2017-4-6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class SgtPeppersTest {
    @Autowired
    private CompactDisc cd;
    @Autowired
    private SgtPeppers sp;

    @Test
    public void testPlay() throws Exception {
        assertNotNull(cd);
        assertNotNull(sp);
        assertEquals(cd,sp);
    }
}
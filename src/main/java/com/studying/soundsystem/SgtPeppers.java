package com.studying.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by fengqz on 2017-4-6.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt.Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}

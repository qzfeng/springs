package com.studying.soundsystem;

/**
 * Created by fengqz on 2017-4-6.
 */
//@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt.Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play(int trackNo) {
        System.out.println("Playing " + title + " by " + artist);
    }
}

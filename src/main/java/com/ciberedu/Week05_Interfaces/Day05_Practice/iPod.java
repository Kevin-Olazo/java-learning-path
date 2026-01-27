package com.ciberedu.Week05_Interfaces.Day05_Practice;

import java.util.Arrays;
import java.util.List;

public class iPod implements Playable, Pausable, Recordable {
    List<String> playlist = Arrays.asList("Zelda Theme", "Mario Bros", "Halo Theme");


    @Override
    public void log() {
        Playable.super.log();
    }
}

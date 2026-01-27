package com.ciberedu.Week05_Interfaces.Day05_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AudioPlayer implements Playable, Pausable {
    List<Song> playlist;

    public AudioPlayer() {
        this.playlist = new ArrayList<>();
    }

    public void addSong(Song song){
        if (song == null){
            System.out.println("Song cannot be null");
            return;
        }

        playlist.add(song);
    }

    public void sortPlaylist(Comparator<Song> comparator){
        Collections.sort(playlist, comparator);

    }

    public void printPlayList(){
        for(Song s : playlist){
            System.out.println(s.toString());
        }
    }

    @Override
    public void pause() {
        System.out.println("Pausing audio...");
    }

    @Override
    public void play() {
        System.out.println("Playing audio...");
    }

}

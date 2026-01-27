package com.ciberedu.Week05_Interfaces.Day05_Practice;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();

        Song s1 = new Song("Something stupid", 155);
        Song s2 = new Song("American Venom", 120);
        Song s3 = new Song("Invincible", 182);


        ap.addSong(s1);
        ap.addSong(s2);
        ap.addSong(s3);


        System.out.println("Regular playlist");
        ap.printPlayList();

        ///

        System.out.println("Sort by duration");
        Comparator<Song> c1 = new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                if (o1.getDuration() < o2.getDuration()) {
                    return -1;
                } else if (o1.getDuration() > o2.getDuration()) {
                    return 1;
                }

                return 0;
            }
        };

        ap.sortPlaylist(c1);
        ap.printPlayList();

        ///

        System.out.println("Sort by A-Z");

        Comparator<Song> c2 = new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };

        ap.sortPlaylist(c2);
        ap.printPlayList();

    }
}

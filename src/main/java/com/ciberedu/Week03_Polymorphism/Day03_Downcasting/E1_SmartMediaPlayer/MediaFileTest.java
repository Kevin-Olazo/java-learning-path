package com.ciberedu.Week03_Polymorphism.Day03_Downcasting.E1_SmartMediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class MediaFileTest {
    public static void main(String[] args) {

        MediaFile vf1 = new Video(false);
        MediaFile vf2 = new Video(false);
        MediaFile vf3 = new Video(true);
        MediaFile vf4 = new Video(false);
        MediaFile vf5 = new Video(true);

        MediaFile sf1 = new Song(true);
        MediaFile sf2 = new Song(true);
        MediaFile sf3 = new Song(true);
        MediaFile sf4 = new Song(false);
        MediaFile sf5 = new Song(false);
        MediaFile sf6 = new Song(true);

        List<MediaFile> mediaFiles = new ArrayList<>();

        mediaFiles.add(vf1);
        mediaFiles.add(vf2);
        mediaFiles.add(vf3);
        mediaFiles.add(vf4);
        mediaFiles.add(vf5);

        mediaFiles.add(sf1);
        mediaFiles.add(sf2);
        mediaFiles.add(sf3);
        mediaFiles.add(sf4);
        mediaFiles.add(sf5);
        mediaFiles.add(sf6);

        MediaFileTest mft = new MediaFileTest();

        mft.analyzePlaylist(mediaFiles);
    }


    public void previewMedia(MediaFile m) {
        if (m == null) {
            throw new IllegalArgumentException("File cannot be null");
        }

        if (m instanceof Video v) {
            v.watch();
        }

        if (m instanceof Song s) {
            s.listen();
        }
    }

    public void analyzePlaylist(List<MediaFile> playlist) {
        int videos4k = 0;
        int instrumentalSongs = 0;
        for (MediaFile f : playlist) {
            if (f instanceof Video v && v.is4K()) {
                videos4k++;
            }
            if (f instanceof Song s && s.isInstrumental()) {
                instrumentalSongs++;
            }
        }
        System.out.println("4K Videos: " + videos4k + ", Instrumental: " + instrumentalSongs);
    }
}



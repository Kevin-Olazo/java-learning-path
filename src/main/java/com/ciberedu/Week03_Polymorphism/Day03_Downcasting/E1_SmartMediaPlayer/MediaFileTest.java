package com.ciberedu.Week03_Polymorphism.Day03_Downcasting.E1_SmartMediaPlayer;

public class MediaFileTest {
    public static void main(String[] args) {

        MediaFile mf1 = new Video();
        MediaFile mf2 = new Song();

        MediaFile[] mediaFiles = new MediaFile[10];
        mediaFiles[0] = mf1;
        mediaFiles[1] = mf2;


    }

    public  void previewMedia(MediaFile m){
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
}

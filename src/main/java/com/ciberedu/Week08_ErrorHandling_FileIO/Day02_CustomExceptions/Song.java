package com.ciberedu.Week08_ErrorHandling_FileIO.Day02_CustomExceptions;

public class Song {
    private String title;
    public Song(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

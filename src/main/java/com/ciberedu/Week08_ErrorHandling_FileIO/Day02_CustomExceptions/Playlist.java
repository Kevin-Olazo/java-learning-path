package com.ciberedu.Week08_ErrorHandling_FileIO.Day02_CustomExceptions;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;
    private int capacity;

    public Playlist(int capacity){
        this.songs = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addSong(Song song) throws PlaylistFullException, DuplicateSongException{
        if (songs.size() >= capacity){
            throw new PlaylistFullException("Playlist is full");
        }

        if (songs.contains(song)){
            throw new DuplicateSongException("Song already in playlist");
        }

        songs.add(song);
        System.out.println("Agregada " + song);
    }

    public void removeSong(Song song){
        if (!songs.contains(song)){
            throw new SongNotFoundException("Song not found");
        }

        songs.remove(song);
        System.out.println("Eliminada: " + song);
    }
}

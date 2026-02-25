package com.ciberedu.Week08_ErrorHandling_FileIO.Day02_CustomExceptions;

public class Main {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist(2);
        Song s1 = new Song("Despacito");
        Song s2 = new Song("Gasolina");

        try {
            myPlaylist.addSong(s1);
            myPlaylist.addSong(s1);
            myPlaylist.addSong(s2);
        } catch (DuplicateSongException e) {
            System.out.println(e.getMessage());
        } catch (PlaylistFullException e) {
            System.out.println(e.getMessage());
        }
    }
}

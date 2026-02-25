package com.ciberedu.Week08_ErrorHandling_FileIO.Day02_CustomExceptions;

public class PlaylistFullException extends Exception {
    public PlaylistFullException(String message) {
        super(message);
    }
}

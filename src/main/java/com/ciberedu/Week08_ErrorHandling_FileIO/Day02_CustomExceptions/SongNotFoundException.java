package com.ciberedu.Week08_ErrorHandling_FileIO.Day02_CustomExceptions;

public class SongNotFoundException extends RuntimeException {
    public SongNotFoundException(String message) {
        super(message);
    }
}

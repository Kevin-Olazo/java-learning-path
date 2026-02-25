package com.ciberedu.Week08_ErrorHandling_FileIO.Day02_CustomExceptions;

public class DuplicateSongException extends RuntimeException {
    public DuplicateSongException(String message) {
        super(message);
    }
}

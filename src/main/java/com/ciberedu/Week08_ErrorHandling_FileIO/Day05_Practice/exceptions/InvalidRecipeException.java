package com.ciberedu.Week08_ErrorHandling_FileIO.Day05_Practice.exceptions;

public class InvalidRecipeException extends RuntimeException {
    public InvalidRecipeException(String message) {
        super(message);
    }
}

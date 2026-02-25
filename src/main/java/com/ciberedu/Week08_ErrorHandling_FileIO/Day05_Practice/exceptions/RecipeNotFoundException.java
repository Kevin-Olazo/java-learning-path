package com.ciberedu.Week08_ErrorHandling_FileIO.Day05_Practice.exceptions;

public class RecipeNotFoundException extends RuntimeException {
    public RecipeNotFoundException(String message) {
        super(message);
    }
}

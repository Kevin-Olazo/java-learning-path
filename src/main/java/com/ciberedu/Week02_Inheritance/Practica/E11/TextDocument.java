package com.ciberedu.Week02_Inheritance.Practica.E11;

import java.util.Arrays;

public class TextDocument {
    private String title, content;

    public TextDocument(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int wordCount() {
        String[] words = content.trim().split(" ");
        return words.length;
    }
}

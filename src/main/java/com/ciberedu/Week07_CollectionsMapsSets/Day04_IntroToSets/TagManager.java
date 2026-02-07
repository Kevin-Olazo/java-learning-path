package com.ciberedu.Week07_CollectionsMapsSets.Day04_IntroToSets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TagManager {
    private Set<String> tags;

    public TagManager() {
        this.tags = new HashSet<>();
    }


    public boolean addTag(String tag) {
        return tags.add(tag);
    }

    public boolean tagExists(String tag) {
        return tags.contains(tag);
    }

    public void printTagsStored() {
        TreeSet<String> tagsSorted = new TreeSet<>(tags);

        for (String tag : tagsSorted) {
            System.out.println("Tag: " + tag);
        }
    }
}

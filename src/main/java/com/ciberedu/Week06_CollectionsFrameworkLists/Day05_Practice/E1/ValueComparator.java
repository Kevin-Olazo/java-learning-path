package com.ciberedu.Week06_CollectionsFrameworkLists.Day05_Practice.E1;

import java.util.Comparator;

public class ValueComparator implements Comparator<GameItem> {

    @Override
    public int compare(GameItem o1, GameItem o2) {
        return Integer.compare(o2.getValue(), o1.getValue());
    }
}

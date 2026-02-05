package com.ciberedu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>(List.of(50, 80, 40, 90, 30));

        Iterator<Integer> it = scores.iterator();

        System.out.println(scores);

        while (it.hasNext()){
            Integer i = it.next();
            if (i < 60){
                it.remove();
            }
        }


    }
}

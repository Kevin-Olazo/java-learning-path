package com.ciberedu.Week05_Interfaces.Day01_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drawable> list = new ArrayList<>();

        list.add(new Circle());
        list.add(new Rectangle());
        list.add(new Character());

        for (Drawable d : list) {
            d.draw();
        }

    }
}

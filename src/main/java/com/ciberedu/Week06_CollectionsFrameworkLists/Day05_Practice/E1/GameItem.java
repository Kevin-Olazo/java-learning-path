package com.ciberedu.Week06_CollectionsFrameworkLists.Day05_Practice.E1;

public class GameItem implements Comparable<GameItem> {
    private String id;
    private String name;
    private int value;
    private double durability;
    private double weight;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getDurability() {
        return durability;
    }

    public void setDurability(double durability) {
        this.durability = durability;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(GameItem o) {
        return this.id.compareTo(o.id);
    }
}

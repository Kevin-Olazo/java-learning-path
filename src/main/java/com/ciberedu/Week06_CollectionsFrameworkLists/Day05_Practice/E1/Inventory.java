package com.ciberedu.Week06_CollectionsFrameworkLists.Day05_Practice.E1;

import java.util.*;

public class Inventory {
    private ArrayList<GameItem> inv = new ArrayList<>();
    private double maxWeight;
    private double currentWeight;

    public Inventory(ArrayList<GameItem> inv, int maxWeight) {
        this.inv = inv;
        this.maxWeight = maxWeight;
        for (GameItem i : inv) {
            this.currentWeight += i.getWeight();
        }
        if (this.currentWeight > maxWeight) {
            throw new IllegalArgumentException("Error: list weight exceeds the max weight");
        }
    }

    public void addItem(GameItem item) {
        if (this.currentWeight + item.getWeight() > maxWeight) {
            throw new IllegalArgumentException("Error: cannot exceed max weight");
        }
        this.currentWeight += item.getWeight();
        inv.add(item);
    }


    public List<GameItem> getTopItems(int count) {
        int min = Math.min(count, inv.size());

        ValueComparator vc = new ValueComparator();

        List<GameItem> copia = new ArrayList<>(inv);

        Collections.sort(copia, vc);

        return copia.subList(0, min);
    }

    public void removeBrokenItems(){
        Iterator<GameItem> it = inv.iterator();

        while(it.hasNext()){
            GameItem item = it.next();
            if (item.getDurability() <= 0){
                it.remove();
            }
        }
    }

    public ArrayList<GameItem> getInv() {
        return inv;
    }

    public void setInv(ArrayList<GameItem> inv) {
        this.inv = inv;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }
}

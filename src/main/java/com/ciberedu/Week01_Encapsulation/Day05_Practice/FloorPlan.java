package com.ciberedu.Week01_Encapsulation.Day05_Practice;

public class FloorPlan {
    private static double costPerSqMeter = 50.0;
    private int totalArea;
    private int roomCount;

    public FloorPlan() {
        totalArea = 0;
        roomCount = 0;
    }

    public void addRoom(Rectangle room) {
        if (room.getArea() <= 0) {
            throw new IllegalArgumentException("Error. Enter a valid room");
        }
        totalArea += room.getArea();
        roomCount++;
    }

    public double getTotalCost() {
        return totalArea * costPerSqMeter;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getTotalArea() {
        return totalArea;
    }
}

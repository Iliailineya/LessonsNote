package me.exercise.inheritance;

import java.util.ArrayList;

public class Box implements Shape {

    private ArrayList<Shape> shapes = new ArrayList<>();

    private double available;
    private final double volume;

    public Box(double available) {
        this.available = available;
        this.volume = available;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public double getAvailable() {
        return available;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}

package me.exercise.basicOOP;

public class MyVector {
    final private double x, y, z;

    public MyVector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //метод, вычисляющий длину вектора
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    //метод, вычисляющий скалярное произведение:
    public double scalarProduct(MyVector myVector) {
        return x * myVector.x + y * myVector.y + z * myVector.z;
    }

    //метод, вычисляющий векторное произведение с другим вектором
    public MyVector crossProduct(MyVector myVector) {
        return new MyVector(
                y * myVector.z - z * myVector.y,
                z * myVector.x - x * myVector.z,
                x * myVector.y - y * myVector.x);
    }

    //метод, вычисляющий косинус угла между векторами
    public double cos(MyVector myVector) {
        return scalarProduct(myVector) / length() * myVector.length();
    }

    //метод для суммы
    public MyVector add(MyVector myVector) {
        return new MyVector(
                x + myVector.x,
                y + myVector.y,
                z + myVector.z
        );
    }

    //метод для разности
    public MyVector subtract(MyVector myVector) {
        return new MyVector(
                x - myVector.x,
                y - myVector.y,
                z - myVector.z
        );
    }

    public static MyVector[] generate(int n) {
        MyVector[] myVectors = new MyVector[n];
        for (int i = 0; i < n; i++) {
            myVectors[i] = new MyVector(Math.random(), Math.random(), Math.random());
        }
        return myVectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
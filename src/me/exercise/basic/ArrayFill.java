package me.exercise.basic;

public class ArrayFill {
    public static int[] arrayFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

    public static double[] arrayFill(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }
//
//    public static long[] arrayFill(long[] array) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (long) (Math.random() * 1000);
//        }
//        return array;
//    }
}

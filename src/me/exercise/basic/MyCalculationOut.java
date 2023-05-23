package me.exercise.basic;

import java.util.Arrays;

public class MyCalculationOut {
    public static void calAllOut(int[] array) {
        System.out.println("Max = " + MyCalculation.max(array));
        System.out.println("Middle = " + MyCalculation.middle(array));
        System.out.println("Min = " + MyCalculation.min(array));
    }
//    static void calMaxOut(int[] array) {
//        System.out.println("Max = " + MyCalculation.max(array));
//    }
//
//    static void calMinOut(int[] array) {
//        System.out.println("Min = " + MyCalculation.min(array));
//    }
//
//    static void calMiddleOut(int[] array) {
//        System.out.println("Middle = " + MyCalculation.middle(array));
//    }

    public static void calMatrixOut(int[] array) {
        for (int i = 0; i < array.length / 10; i++) {
            for (int j = 0; j < array.length / 10; j++) {

                System.out.print(array[i * 10 + j] + " ");
            }
            System.out.println();
        }
    }

    public static void primeNumOut(int n) {
        MyCalculation.primeNum(n);
    }

    public static void removeElementArrayOut(int[] array, int removeElements) {
        System.out.println(Arrays.toString(MyCalculation.removeElement(array, removeElements)));
    }
}

package me.exercise.basic;

import java.util.Arrays;

public class MyCalculation {
    public static int max(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = 100;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int middle(int[] arr) {
        int middle = 0;
        for (int i : arr) {
            middle += i / arr.length;
        }
        return middle;
    }

    public static void primeNum(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    public static int[] removeElement(int[] array, int val) {
        int offset = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                offset++;
            } else {
                array[i - offset] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - offset);
    }
}

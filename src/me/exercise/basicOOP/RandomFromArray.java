package me.exercise.basicOOP;

import java.util.*;

public class RandomFromArray {
    int[] values;
    int[] weightValues;

    public RandomFromArray(int[] values, int[] weightValues) {
        this.values = values;
        this.weightValues = weightValues;
    }

    public int returnValue() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < weightValues[i]; j++) {
                list.add(values[i]);
            }
        }
        return list.get((int) (Math.random() * list.size()));
    }
}

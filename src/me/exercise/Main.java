package me.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Решение какой задачи вывести?");

        int choose = scanner.nextInt();
        var exercise = new Exercise();

        switch (choose) {
            case (1) -> exercise.one();
            case (2) -> exercise.two();
            case (3) -> exercise.three();
            case (4) -> exercise.four();
            case (5) -> exercise.fife();
            case (6) -> exercise.six();
            case (7) -> exercise.seven();
            case (8) -> exercise.eight();
            case (9) -> exercise.nine();
            // 7.037237393580069
            // 7.0367431640625
            // 7.037237361073494
            case (10) -> exercise.ten();
            case (11) -> exercise.eleven();
            case (12) -> exercise.twelve();
            default -> throw new IllegalStateException("Unexpected value: " + choose);
        }
    }
}

package me.mythread.waitnotify;

import java.util.*;

public class Main {

    static List<String> strings = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        new Operator().start();
        new Machine().start();
    }


    static class Operator extends Thread {
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                synchronized (strings) {
                    strings.add(scanner.nextLine());
                    strings.notify();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

            }

        }
    }

    static class Machine extends Thread {
        @Override
        public void run() {
            while (strings.isEmpty()) {
                synchronized (strings) {
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println(strings.remove(0));
                }
            }
        }
    }
}
package me.mythread.ForkJoinFramework;


import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main {

    static long numOfOperations = 10_000_000_000L;

    static int numOfTreads = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        Date date1 = new Date();
        ForkJoinPool pool = new ForkJoinPool(numOfTreads);
        System.out.println(pool.invoke(new MyFork(0, numOfOperations)));
        Date date2 = new Date();
        System.out.println(date2.getTime() - date1.getTime());
    }

    static class MyFork extends RecursiveTask<Long> {
        long from, to;

        public MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {
            if ((to - from) <= numOfOperations / numOfTreads) {
                long j = 0;
                for (long i = from; i < to; i++) {
                    j += i;

                }
                return j;
            } else {
                long middle = (to + from) / 2;
                MyFork firstHalf = new MyFork(from, middle);
                firstHalf.fork();
                MyFork secondHalf = new MyFork(middle + 1, to);
                long secondValue = secondHalf.compute();
                return firstHalf.join() + secondValue;
            }
        }
    }
}

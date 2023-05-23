package me.mythread;

public class Main {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {

            Resource.i = 5;
            MyThread myThread = new MyThread();
            myThread.setName("One");
            MyThread myThread2 = new MyThread();
            myThread.start();
            myThread2.start();
            myThread.join();
            myThread2.join();
            System.out.println(Resource.i);
        }
    }
}

class MyThread extends Thread {

    Resource resource;

    @Override
    public void run() {
        Resource.changeStaticI();
        new Resource().changeI();
    }
}

class Resource {
    static int i;

    public synchronized static void changeStaticI() {
        int i = Resource.i;
        if (Thread.currentThread().getName().equals("One")) {
            Thread.yield();
        }
        i++;
        Resource.i = i;
    }

    public synchronized void changeI() {
        int i = Resource.i;
        if (Thread.currentThread().getName().equals("One")) {
            Thread.yield();
        }
        i++;
        Resource.i = i;
    }
}
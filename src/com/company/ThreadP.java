package com.company;

class MultithreadingDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getPriority() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
public class ThreadP {
    public static void func() {
        Thread t = Thread.currentThread();
        if(t.isAlive())
            t.setName("in function");
        int p = t.getPriority();
        System.out.println(t);
        System.out.println(p);
    }
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("some name");
        t.setPriority(10);
        System.out.println(t);
        func();

        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();

    }
}


package com.company;

public class MultiT implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread has ended");
    }
    public static void main(String[] args) {
        MultiT obj = new MultiT();
        Thread t1 = new Thread(obj);
        t1.start();
        try {
            System.out.println("in try...");
            t1.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hi");
    }
}

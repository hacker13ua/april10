package org.esurpvskiy;


public class MyBoomMain {
    public static void main(String[] args) throws InterruptedException {
        MyBoomThread thread = new MyBoomThread();
        thread.start();
        System.out.println("Boom");
        thread.join();
    }
}

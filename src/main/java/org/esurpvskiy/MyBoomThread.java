package org.esurpvskiy;


import java.util.concurrent.TimeUnit;

public class MyBoomThread extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(1),8);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

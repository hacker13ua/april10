package org.esurpvskiy;

import java.util.Random;
import java.util.concurrent.Callable;


public class MyTestCallable implements Callable<String> {
    private final int workerNumber;

    public MyTestCallable(final int workerNumber) {
        this.workerNumber = workerNumber;
    }

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("Worker " +
                    workerNumber +
                    "; iteration=" + i);
            Thread.sleep(new Random().nextInt(100));
        }
        return "work " + workerNumber;
    }
}

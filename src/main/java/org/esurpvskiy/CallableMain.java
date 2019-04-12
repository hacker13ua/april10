package org.esurpvskiy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor
                = Executors.newFixedThreadPool(4);
        List<MyTestCallable> callables = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            callables.add(new MyTestCallable(i));
        }
        System.out.println("All tasks created");
        List<Future<String>> futures = new ArrayList<>();
        for (MyTestCallable callable : callables) {
            Future<String> future = executor.submit(callable);
            futures.add(future);
        }
        System.out.println("All tasks submited");
        executor.shutdown();
        for (Future<String> future : futures) {
            String workerResult = future.get();
            System.out.println(workerResult + " ended");
        }
        System.out.println("All tasks ended");


    }
}


















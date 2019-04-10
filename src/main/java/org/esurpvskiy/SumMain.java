package org.esurpvskiy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class SumMain {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> array = new ArrayList<>();
        final Random rnd = new Random();
        for (int i = 0; i < 1000; i++) {
            array.add(rnd.nextInt(100));
        }
        final MySumThread thread1 = new MySumThread();
        thread1.setStartIndex(0);
        thread1.setStopIndex(500);
        thread1.setArray(array);
        final MySumThread thread2 = new MySumThread();
        thread2.setStartIndex(501);
        thread2.setStopIndex(1000);
        thread2.setArray(array);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(thread1.getSumResult() + thread2.getSumResult());
    }





















}

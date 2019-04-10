package org.esurpvskiy;

import java.util.List;
import java.util.stream.IntStream;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class MySumThread extends Thread {
    int startIndex;
    int stopIndex;
    long sumResult;
    List<Integer> array;

    public void setStartIndex(final int startIndex) {
        this.startIndex = startIndex;
    }

    public void setStopIndex(final int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public void setArray(final List<Integer> array) {
        this.array = array;
    }

    public long getSumResult() {
        return sumResult;
    }

    @Override
    public void run() {

        sumResult = array.subList(startIndex, stopIndex)
                .stream()
                .mapToInt(value -> value)
                .sum();

        /*for (int i = startIndex; i < stopIndex; i++) {
            sumResult += array.get(i);
        }*/
    }
}











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
        for (int i = startIndex; i < stopIndex; i+=4) {
            sumResult += array.get(i);
            sumResult += array.get(i+1);
            sumResult += array.get(i+2);
            sumResult += array.get(i+3);
        }
    }
}











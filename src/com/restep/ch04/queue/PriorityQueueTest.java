package com.restep.ch04.queue;

/**
 * 优先级队列
 *
 * @author restep
 * @date 2019/3/5
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(5);
        queue.insert(30);
        queue.insert(50);
        queue.insert(10);
        queue.insert(40);
        queue.insert(20);

        while (!queue.isEmpty()) {
            long item = queue.remove();
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}

class PriorityQueue {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQueue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        int j;

        if (nItems == 0) {
            queArray[nItems++] = item;
        } else {
            for (j = nItems - 1; j >= 0; j--) {
                if (item > queArray[j]) {
                    queArray[j + 1] = queArray[j];
                } else {
                    break;
                }
            }

            queArray[j + 1] = item;
            nItems++;
        }
    }

    public long remove() {
        return queArray[--nItems];
    }

    public long peekMin() {
        return queArray[nItems - 1];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
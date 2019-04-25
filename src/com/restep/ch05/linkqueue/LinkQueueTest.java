package com.restep.ch05.linkqueue;

/**
 * 链表实现队列
 *
 * @author restep
 * @date 2019/3/5
 */
public class LinkQueueTest {
    public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();
        queue.insert(20);
        queue.insert(40);

        queue.displayQueue();

        queue.insert(60);
        queue.insert(80);

        queue.displayQueue();

        queue.remove();
        queue.remove();

        queue.displayQueue();
    }
}

class Link {
    public long dData;
    public Link next;

    public Link(long d) {
        dData = d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}

class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(long dd) {
        Link newLink = new Link(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public long deleteFirst() {
        long temp = first.dData;
        if (null == first.next) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList() {
        Link current = first;

        while (null != current) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}

class LinkQueue {
    private FirstLastList theList;

    public LinkQueue() {
        theList = new FirstLastList();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void insert(long j) {
        theList.insertLast(j);
    }

    public long remove() {
        return theList.deleteFirst();
    }

    public void displayQueue() {
        System.out.print("Queue (front-->rear): ");
        theList.displayList();
    }
}

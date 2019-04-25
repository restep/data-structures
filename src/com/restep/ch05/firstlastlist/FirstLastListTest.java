package com.restep.ch05.firstlastlist;

/**
 * 双端链表
 *
 * @author restep
 * @date 2019/3/5
 */
public class FirstLastListTest {
    public static void main(String[] args) {
        FirstLastList list = new FirstLastList();

        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(66);

        list.insertLast(11);
        list.insertLast(33);
        list.insertLast(55);

        list.displayList();

        list.deleteFirst();
        list.deleteFirst();

        list.displayList();
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

    public void insertFirst(long dd) {
        Link newLink = new Link(dd);

        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
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
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}

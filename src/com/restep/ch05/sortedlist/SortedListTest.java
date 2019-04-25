package com.restep.ch05.sortedlist;

/**
 * 有序链表
 *
 * @author restep
 * @date 2019/3/5
 */
public class SortedListTest {
    public static void main(String[] args) {
        SortedList list = new SortedList();
        list.insert(20);
        list.insert(40);

        list.displayList();

        list.insert(10);
        list.insert(30);
        list.insert(50);

        list.displayList();

        list.remove();

        list.displayList();
    }
}

class Link {
    public long dData;
    public Link next;

    public Link(long dd) {
        dData = dd;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}

class SortedList {
    private Link first;

    public SortedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(long key) {
        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;

        while (current != null && key > current.dData) {
            previous = current;
            current = current.next;
        }

        if (null == previous) {
            first = newLink;
        } else {
            previous.next = newLink;
        }

        newLink.next = current;
    }

    public Link remove() {
        Link temp = first;
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

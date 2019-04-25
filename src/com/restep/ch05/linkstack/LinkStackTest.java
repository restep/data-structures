package com.restep.ch05.linkstack;

/**
 * 链表实现栈
 *
 * @author restep
 * @date 2019/3/5
 */
public class LinkStackTest {
    public static void main(String[] args) {
        LinkStack stack = new LinkStack();

        stack.push(20);
        stack.push(40);

        stack.displayStack();

        stack.push(60);
        stack.push(80);

        stack.displayStack();

        stack.pop();
        stack.pop();

        stack.displayStack();
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

class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) {
        Link newLink = new Link(dd);
        newLink.next = first;
        first = newLink;
    }

    public long deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp.dData;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}

class LinkStack {
    private LinkList theList;

    public LinkStack() {
        theList = new LinkList();
    }

    public void push(long j) {
        theList.insertFirst(j);
    }

    public long pop() {
        return theList.deleteFirst();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void displayStack() {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
}

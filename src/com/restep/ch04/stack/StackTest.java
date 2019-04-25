package com.restep.ch04.stack;

/**
 * 栈
 *
 * @author restep
 * @date 2019/3/5
 */
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);

        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.print(value + " ");
        }
    }
}

class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}

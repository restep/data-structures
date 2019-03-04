package com.restep.ch02.lowarray;

/**
 * @author restep
 * @date 2019/3/3
 */
public class LowArrayTest {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        int nElems = 10;
        int j;

        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);

        for (j = 0; j < nElems; j++) {
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println();

        //查找
        int searchKey = 22;
        for (j = 0; j < nElems; j++) {
            if (arr.getElem(j) == searchKey) {
                break;
            }
        }
        if (j == nElems) {
            System.out.println("Can't find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }

        //删除
        for (j = 0; j < nElems; j++) {
            if (arr.getElem(j) == 55) {
                break;
            }
        }
        for (int k = j; k < nElems; k++) {
            arr.setElem(k, arr.getElem(k + 1));
        }
        nElems--;

        for (j = 0; j < nElems; j++) {
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println("");
    }
}

class LowArray {
    private long[] arr;

    public LowArray(int size) {
        arr = new long[size];
    }

    public void setElem(int index, long value) {
        arr[index] = value;
    }

    public long getElem(int index) {
        return arr[index];
    }
}

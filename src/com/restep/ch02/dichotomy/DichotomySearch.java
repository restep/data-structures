package com.restep.ch02.dichotomy;

/**
 * @author restep
 * @date 2019/3/3
 */
public class DichotomySearch {
    private static int count = 0;

    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int searchKey = 1;
        dichotomySearch(1, arr[arr.length - 1], searchKey);
        System.out.println("count: " + count);
    }

    private static void dichotomySearch(int low, int high, int searchKey) {
        count++;

        int middle = low + (high - low) / 2;
        if (searchKey < middle) {
            dichotomySearch(low, middle - 1, searchKey);
        }

        if (searchKey > middle) {
            dichotomySearch(middle + 1, high, searchKey);
        }
    }
}



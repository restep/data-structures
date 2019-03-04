package com.restep.ch03;

/**
 * 冒泡排序
 * @author restep
 * @date 2019/3/4
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 9;
        arr[1] = 3;
        arr[2] = 0;
        arr[3] = 8;
        arr[4] = 1;
        arr[5] = 4;
        arr[6] = 7;
        arr[7] = 2;
        arr[8] = 6;
        arr[9] = 5;

        System.out.print("未排序: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //总共需要比较9次
        for (int i = 0; i < arr.length - 1; i++) {
            //每次把最大的数排到最右边
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.print("经过第" + (i + 1) + "次排序： ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}

package com.restep.ch03;

/**
 * 冒泡排序
 *
 * @author restep
 * @date 2019/3/4
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 9;
        arr[1] = 13;
        arr[2] = 0;
        arr[3] = 18;
        arr[4] = 1;
        arr[5] = 14;
        arr[6] = 19;
        arr[7] = 12;
        arr[8] = 16;
        arr[9] = 5;
        arr[10] = 17;
        arr[11] = 3;
        arr[12] = 10;
        arr[13] = 8;
        arr[14] = 11;
        arr[15] = 4;
        arr[16] = 7;
        arr[17] = 2;
        arr[18] = 6;
        arr[19] = 15;

        System.out.print("未排序: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //总共需要比较arr.length-1次
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

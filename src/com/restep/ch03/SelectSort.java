package com.restep.ch03;

/**
 * 扫描数组 记录下最小的数  和第一个位置的数交换
 * 扫描数组 记录下最小的数  和第二个位置的数交换
 * 选择排序 比冒泡排序 减少了数的移动
 *
 * @author restep
 * @date 2019/3/4
 */
public class SelectSort {
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
        
        //总共需要9次将最小的数交换到左边
        for (int i = 0; i < arr.length - 1; i++) {
            //记录最小的数的下标
            int min = i;
            for (int j = min; j < arr.length - 1; j++) {
                if (arr[min] > arr[j + 1]) {
                    min = j + 1;
                }
            }
            System.out.println("找到最小的数: " + arr[min] + " 下标: " + min);

            //将最小的数和左边交换
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            System.out.print("经过第" + (i + 1) + "次排序： ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}

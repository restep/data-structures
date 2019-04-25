package com.restep.ch03;

/**
 * 插入排序
 * ---------------(移动到的位置)----------------(抽取的数字下标)
 * 抽取的数字插入向左移动到 没有数字比它大的位置
 *
 * @author restep
 * @date 2019/3/4
 */
public class InsertSort2 {
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

        //从第二个开始抽取数字
        for (int i = 1; i < arr.length; i++) {
            //记录抽取的数字
            int index = i;
            int temp = arr[index];

            while (index > 0 && temp < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = temp;

            System.out.print("经过第" + i + "次排序： ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}

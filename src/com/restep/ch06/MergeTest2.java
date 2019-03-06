package com.restep.ch06;

/**
 * 合并两个有序数组 版本二
 * @author restep
 * @date 2019/3/6
 */
public class MergeTest2 {
    public static void main(String[] args) {
        int[] aArr = new int[8];
        aArr[0] = 23;
        aArr[1] = 47;
        aArr[2] = 81;
        aArr[3] = 95;
        aArr[4] = 105;
        aArr[5] = 122;
        aArr[6] = 222;
        aArr[7] = 322;


        int[] bArr = new int[6];
        bArr[0] = 7;
        bArr[1] = 14;
        bArr[2] = 39;
        bArr[3] = 55;
        bArr[4] = 222;
        bArr[5] = 300;

        int[] mergeArr = new int[aArr.length + bArr.length];

        merge(aArr, bArr, mergeArr);

        for (int i = 0; i < mergeArr.length; i++) {
            System.out.print(mergeArr[i] + " ");
        }
        System.out.println();
    }

    private static void merge(int[] aArr, int[] bArr, int[] mergeArr) {
        int aIndex = 0;
        int bIndex = 0;
        int mergeIndex = 0;

        //两个数组都不为空
        while (aIndex < aArr.length && bIndex < bArr.length) {
            if (aArr[aIndex] < bArr[bIndex]) {
                mergeArr[mergeIndex] = aArr[aIndex];

                aIndex++;
                mergeIndex++;
            } else {
                mergeArr[mergeIndex] = bArr[bIndex];

                bIndex++;
                mergeIndex++;
            }
        }

        //a数组已经取完
        while (bIndex < bArr.length) {
            mergeArr[mergeIndex] = bArr[bIndex];

            bIndex++;
            mergeIndex++;
        }

        //b数组已经取完
        while (aIndex < aArr.length) {
            mergeArr[mergeIndex] = aArr[aIndex];

            aIndex++;
            mergeIndex++;
        }
    }
}

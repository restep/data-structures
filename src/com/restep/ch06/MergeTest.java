package com.restep.ch06;

/**
 * 归并排序
 * 合并两个有序数组
 *
 * @author restep
 * @date 2019/3/6
 */
public class MergeTest {
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

        merge(0, 0, 0, aArr, bArr, mergeArr);

        for (int i = 0; i < mergeArr.length; i++) {
            System.out.print(mergeArr[i] + " ");
        }
        System.out.println();
    }

    private static void merge(int aIndex, int bIndex, int mergeIndex, int[] aArr, int[] bArr, int[] mergeArr) {
        //a数组已经取完 或者 a数组比b数组大  从b数组取值
        while (bIndex < bArr.length && (aIndex == aArr.length || aArr[aIndex] >= bArr[bIndex])) {
            mergeArr[mergeIndex] = bArr[bIndex];

            bIndex++;
            mergeIndex++;
        }

        //b数组已经取完 或者 b数组比a数组小  从a数组取值
        while (aIndex < aArr.length && (bIndex == bArr.length || aArr[aIndex] <= bArr[bIndex])) {
            mergeArr[mergeIndex] = aArr[aIndex];

            aIndex++;
            mergeIndex++;
        }

        if (mergeIndex != mergeArr.length) {
            merge(aIndex, bIndex, mergeIndex, aArr, bArr, mergeArr);
        }
    }
}

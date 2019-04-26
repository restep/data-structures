package com.restep.ch06;

/**
 * 汉诺塔
 *
 * @author restep
 * @date 2019/3/6
 */
public class TowerTest {
    private static int nDisks = 3;

    public static void main(String[] args) {
        doTowers(nDisks, 'A', 'B', 'C');
    }

    public static void doTowers(int topN, char src, char inter, char dest) {
        if (topN == 1) {
            System.out.println("Disk 1 from " + src + " to " + dest);
        } else {
            doTowers(topN - 1, src, dest, inter);

            System.out.println("Disk " + topN + " from " + src + " to " + dest);
            doTowers(topN - 1, inter, src, dest);
        }
    }
}

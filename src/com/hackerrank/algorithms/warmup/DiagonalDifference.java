package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by shawn on 15-9-25.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[][] array = new int[length][length];
        for(int i = 0;i<length;i++){
            for(int j = 0;j<length;j++){
                array[i][j] = in.nextInt();
            }
        }
        System.out.println(getSumResult(array));
    }

    private static int getSumResult(int[][] array) {
        int result = 0;
        for(int i=0;i<array.length;i++){
            result += array[i][i]-array[i][array[i].length-1-i];
        }
        return Math.abs(result);
    }
}

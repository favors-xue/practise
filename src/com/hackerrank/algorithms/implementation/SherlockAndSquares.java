package com.hackerrank.algorithms.implementation;


import java.util.Scanner;

/**
 * first calculate the max number of the sqrt, then calculate the min number of the sqrt, then count the number between them.
 * Created by shawn on 15-10-13.
 */
public class SherlockAndSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[][] testCase = new int[length][2];
        for(int i = 0;i<length;i++){
            int[] range = new int[2];
            range[0] = in.nextInt();
            range[1] = in.nextInt();
            testCase[i] = range;
        }

        for(int[] s:testCase){
            System.out.println((int)(Math.floor(Math.sqrt(Double.valueOf(String.valueOf(s[1]))))-Math.ceil(Math.sqrt(Double.valueOf(String.valueOf(s[0]))))+1));
        }

    }
}

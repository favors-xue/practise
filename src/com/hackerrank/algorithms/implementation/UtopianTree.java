package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by shawn on 15-10-12.
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] testCase = new int[length];
        for(int i=0;i<length;i++){
            testCase[i] = in.nextInt();
        }
        for(int e : testCase){
            int cycle = e/2;
            int result = caculateHeight(1, cycle);

            int rest = e%2;
            if(rest == 0){
                System.out.println(result);
            }
            else {
                System.out.println(result*2);
            }
        }
    }

    private static int caculateHeight(int result, int e) {
        if(e == 0){
            return result;
        }
        else {
            return caculateHeight((result * 2)+1,e-1);
        }

    }
}

package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by shawn on 15-9-25.
 */
public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        Long[] array = new Long[length];
        for(int i=0;i<length;i++){
            array[i] = in.nextLong();
        }
        System.out.println(getSumNum(array));
    }

    private static Long getSumNum(Long[] array) {
        Long result = new Long(0);
        if(array == null){
            return result;
        }
        if(array.length == 0){
            return result;
        }
        for(Long num: array){
            result += num;
        }
        return result;
    }
}

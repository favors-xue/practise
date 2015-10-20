package com.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by shawn on 15-9-25.
 */
public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length;i++){
            array[i] = in.nextInt();
        }
        System.out.println(getSumNum(array));
    }

    private static int getSumNum(int[] array) {
        int result = 0;
        if(array == null){
            return result;
        }
        if(array.length == 0){
            return result;
        }
        for(int num: array){
            result += num;
        }
        return result;
    }
}

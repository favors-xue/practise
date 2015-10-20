package com.algorithms.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by shawn on 15-9-25.
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length;i++){
            array[i] = in.nextInt();
        }

        System.out.println(String.format("%.6f", getPostiResult(array, length)));
        System.out.println(String.format("%.6f", getNagetiResult(array, length)));
        System.out.println(String.format("%.6f",getZeroResult(array, length)));

    }

    private static double getZeroResult(int[] array,Integer length) {
        int count=0;
        for(Integer element:array){
            if(element == 0){
                count++;
            }
        }
        return (double)(count*1000)/(length*1000);

    }

    private static double getNagetiResult(int[] array,Integer length) {
        int count=0;
        for(Integer element:array){
            if(element < 0){
                count++;
            }
        }
        return (double)(count*1000)/(length*1000);

    }

    private static double getPostiResult(int[] array,Integer length) {
        int count=0;
        for(Integer element:array){
            if(element > 0){
                count++;
            }
        }
        return (double)(count*1000)/(length*1000);

    }


}

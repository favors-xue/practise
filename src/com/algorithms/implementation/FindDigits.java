package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by shawn on 15-10-12.
 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] testCase = new int[length];
        for(int i = 0;i<length;i++){
            testCase[i] = in.nextInt();

        }
        for(int e:testCase){
            System.out.println(getDigitsNumber(e));
        }
    }

    private static int getDigitsNumber(int e) {
        String strNum  = String.valueOf(e);
        int count = 0;
        for(int i = 0;i<strNum.length();i++){
            int intNumber = Integer.valueOf(String.valueOf(strNum.charAt(i)));
            if(intNumber == 0){
                continue;
            }
            if(e%intNumber == 0){
                count ++;
            }
        }
        return count;
    }
}

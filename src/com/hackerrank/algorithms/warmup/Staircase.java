package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by shawn on 15-9-29.
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        String[][] arr = new String[length][length];
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(j>=length-i-1){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

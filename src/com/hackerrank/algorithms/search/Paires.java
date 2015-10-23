package com.hackerrank.algorithms.search;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by shawn on 15-10-23.
 */
public class Paires {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++){
            numbers[i] = in.nextInt();
        }
        if(n==1){
            System.out.println(0);
            return;
        }
        if(n==2){
            if(Math.abs(numbers[0]-numbers[1])!=k){
                System.out.println(0);
            }
            else {
                System.out.println(1);
            }
            return;
        }
        Arrays.sort(numbers);
        System.out.println(getNumberCound(numbers,numbers.length-1,0,k));
    }

    private static int getNumberCound(int[] numbers,int start,int total,int k){
        int nextNumber = numbers[start]-k;
        if(numbers[0]>nextNumber){
            return total;
        }

        for(int i=start;i>=0;i--){
            if(numbers[i]==nextNumber){
                total++;
                break;
            }
        }
        return getNumberCound(numbers,--start,total,k);
    }
}

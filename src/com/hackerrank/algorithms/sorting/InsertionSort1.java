package com.hackerrank.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by shawn on 15-10-20.
 */
public class InsertionSort1 {
    public static void insertIntoSorted(int[] ar) {
        int sig = ar[ar.length-1];
        for(int i=ar.length-1;i>=0;i--){
            if(i==0){
                ar[i] = sig;
                printArray(ar);
                break;
            }
             if(sig<ar[i-1]){
                 ar[i] = ar[i-1];
                 printArray(ar);
             }
             else {
                 ar[i] = sig;
                 printArray(ar);
                 break;
             }
        }
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}

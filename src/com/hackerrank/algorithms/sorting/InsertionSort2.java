package com.hackerrank.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by shawn on 15-10-26.
 */
public class InsertionSort2 {
    public static void insertionSortPart2(int[] ar)
    {
        for(int i=1;i<ar.length;i++){
            insertIntoSorted(ar,i);
            printArray(ar);
        }
    }

    public static void insertIntoSorted(int[] ar,int end) {
        int sig = ar[end];
        for(int i=end;i>=0;i--){
            if(i==0){
                ar[i] = sig;
                break;
            }
            if(sig<ar[i-1]){
                ar[i] = ar[i-1];
            }
            else {
                ar[i] = sig;
                break;
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}

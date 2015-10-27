package com.hackerrank.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by shawn on 15-10-26.
 */
public class IntroToTutorialChallenges {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i = 0;i<n;i++){
            ar[i] = in.nextInt();
        }

        System.out.println(getIndex(ar,v));
    }

    private static int getIndex(int[] ar, int v) {
        for(int i =0;i<ar.length;i++){
            if(v <= ar[i]){
                if(i == 0){
                    return 0;
                }
                else if(i==ar.length-1){
                    return ar.length-1;
                }
                else {
                    return i;
                }
            }
        }
        return 0;
    }
}

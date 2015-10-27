package com.hackerrank.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by shawn on 15-10-26.
 */
public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] ci = new int[n];
            for(int j = 0;j<n;j++){
                ci[j] = in.nextInt();
            }
            getIndexes(m,ci);
        }
    }

    private static void getIndexes(int m, int[] ci) {
        for(int i=0;i<ci.length;i++){
            if(ci[i]>=m){
                continue;
            }
            Arrays.sort(ci);
            int index = getRestNumber(m,ci[i],ci,i+1);
            if(index>0){
                System.out.print(i+" "+index);
                break;
            }
        }
    }

    private static int getRestNumber(int m, int i, int[] ci, int i1) {

        return 0;
    }
}

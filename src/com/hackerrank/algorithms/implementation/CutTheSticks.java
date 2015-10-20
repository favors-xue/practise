package com.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by shawn on 15-10-16.
 */
public class CutTheSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] sticks = new int[length];
        for(int i=0;i<length;i++){
            sticks[i] = in.nextInt();
        }
        System.out.println(length);
        Arrays.sort(sticks);
        cutSticks(sticks);
    }

    private static void cutSticks(int[] sticks) {
        int i = sticks[0];
        int index = 0;
        for(int j = 0;j<sticks.length;j++){
            sticks[j] -= i;
            if(sticks[j]==0){
                index++;
            }
        }
        int[] dest = new int[sticks.length - index];
        if(dest.length==0){
            return;
        }
        System.out.println(dest.length);
        System.arraycopy(sticks,index,dest,0,dest.length);
        cutSticks(dest);
    }
}

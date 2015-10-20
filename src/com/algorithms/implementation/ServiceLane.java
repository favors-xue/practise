package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Timing complex for this is O(N*T)
 * to do the sort before calculation we can short the time to O(N+T)
 * to do the better sort, we can make the time as O(N+logT)
 * Created by shawn on 15-10-15.
 */
public class ServiceLane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int testCaseNo = in.nextInt();
        int[] lines = new int[length];
        int[][] testCases = new int[testCaseNo][2];
        for(int i= 0;i<length;i++){
            lines[i] = in.nextInt();
        }
        for(int j = 0;j<testCaseNo;j++){
            int[] cases = new int[2];
            cases[0] = in.nextInt();
            cases[1] = in.nextInt();
            testCases[j] = cases;
        }
        for(int[] cases: testCases){
            System.out.println(getVehicleType(lines,cases));
        }
    }

    private static int getVehicleType(int[] lines, int[] cases) {
        return getMinLine(lines,cases[0],cases[1]);
    }

    private static int getMinLine(int[] lines, int start, int end) {
        int width = lines[start];
        for(int i = start;i<=end;i++){
            if(lines[i] < width){
                width = lines[i];
            }
        }
        return width;
    }
}

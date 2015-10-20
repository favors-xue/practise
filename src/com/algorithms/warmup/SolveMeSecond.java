package com.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by shawn on 15-9-25.
 */
public class SolveMeSecond {
    static int solveMeSecond(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        int sum;
        int a,b;
        t = in.nextInt();
        for (int i=0;i<t;i++) {
            a = in.nextInt();
            b = in.nextInt();
            sum = solveMeSecond(a, b);
            System.out.println(sum);
        }
    }
}

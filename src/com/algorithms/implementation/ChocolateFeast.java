package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by shawn on 15-10-16.
 */
public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static long Solve(int N, int C, int M){
        int number = N/C;

        return number+getTotalNumber(number, M);
    }

    private static int getTotalNumber(int number, int m) {
        int discount = number/m;
        if(discount == 0){
            return discount;
        }
        int rest = number-(discount*m);
        return discount+getTotalNumber(discount+rest,m);
    }

}

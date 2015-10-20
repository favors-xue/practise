package com.algorithms.bitmanipulation;

import java.util.Scanner;

/**
 * Created by shawn on 15-10-19.
 */
public class FlippingBits {
    private static long MAX = (long)Math.pow(2,32)-1;
    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        for(int i = 0;i<length;i++){
            long num = in.nextLong();
            System.out.println(MAX - num);
            System.out.println(Integer.MAX_VALUE - num);
            System.out.println((long)Math.pow(2,32)-1 - num);

        }

    }

}

package com.hackerrank.algorithms.warmup;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by shawn on 15-9-30.
 */
public class Extralongfactorials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        BigInteger result = new BigInteger(String.valueOf(length));
        for(int i=0;i<length-1;i++){
            result = result.multiply(new BigInteger(String.valueOf(length-i-1)));
        }
        System.out.println(result);
    }

}

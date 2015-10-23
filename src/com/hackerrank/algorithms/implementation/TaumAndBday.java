package com.hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * <a>https://www.hackerrank.com/challenges/taum-and-bday</a>
 * Created by shawn on 15-10-22.
 */
public class TaumAndBday {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        for(int i = 0;i<length;i++){
            int b = in.nextInt();
            int w = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            System.out.println(calculateAmount(b,w,x,y,z));
        }
    }

    private static BigInteger calculateAmount(int b, int w, int x, int y, int z) {
        if(y==x){
            return (new BigInteger(String.valueOf(b)).multiply(new BigInteger(String.valueOf(x)))).add(new BigInteger(String.valueOf(w)).multiply(new BigInteger(String.valueOf(y))));
        }
        if((x+z)<y){
            return (new BigInteger(String.valueOf(b)).add(new BigInteger(String.valueOf(w)))).multiply(new BigInteger(String.valueOf(x))).add(new BigInteger(String.valueOf(w)).multiply(new BigInteger(String.valueOf(z))));
        }
        if((y+z)<x){
            return (new BigInteger(String.valueOf(b)).add(new BigInteger(String.valueOf(w)))).multiply(new BigInteger(String.valueOf(y))).add(new BigInteger(String.valueOf(b)).multiply(new BigInteger(String.valueOf(z))));
        }
        return (new BigInteger(String.valueOf(b)).multiply(new BigInteger(String.valueOf(x)))).add(new BigInteger(String.valueOf(w)).multiply(new BigInteger(String.valueOf(y))));
    }
}

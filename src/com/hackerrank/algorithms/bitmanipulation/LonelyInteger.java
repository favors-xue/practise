package com.hackerrank.algorithms.bitmanipulation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by shawn on 15-10-20.
 */
public class LonelyInteger {
    static int lonelyinteger(int[] a) {
        Arrays.sort(a);
        for(int i = 0;i<a.length-1;i+=2){
            if(a[i]!=a[i+1]){
                return a[i];
            }
        }
        return a[a.length-1];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = lonelyinteger(_a);
        System.out.println(res);

    }
}

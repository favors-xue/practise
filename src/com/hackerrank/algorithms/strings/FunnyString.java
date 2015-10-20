package com.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * Created by shawn on 15-10-19.
 */
public class FunnyString {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        String[] letters = new String[length];
        for(int i=0;i<length;i++){
            letters[i] = in.next();
        }

        for(String letter:letters){
            System.out.println(isFunny(letter));
        }
    }

    private static String isFunny(String letter) {
        char[] chars = letter.toCharArray();
        int mid = chars.length/2;
        if(mid == 1){
            return "Funny";
        }
        if(chars.length%2==0){
            for(int i=0;i<mid-1;i++){
                if(Math.abs((double)(chars[i]-chars[i+1]))!= Math.abs((double)(chars[chars.length-1-i]-chars[chars.length-1-i-1]))){
                    return "Not Funny";
                }
            }
        }
        else {
            for(int i=0;i<mid;i++){
                if(Math.abs((double)(chars[i]-chars[i+1]))!= Math.abs((double)(chars[chars.length-1-i]-chars[chars.length-1-i-1]))){
                    return "Not Funny";
                }
            }

        }
        return "Funny";

    }
}

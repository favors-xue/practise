package com.hackerrank.algorithms.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by shawn on 15-10-22.
 */
public class AlternatingCharacter {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        String[] testCases = new String[length];
        for(int i=0;i<length;i++){
            testCases[i] = in.next();
        }

        for(String str:testCases){
            System.out.println(getDeletionNumber(str));
        }
    }

    private static int getDeletionNumber(String str) {
        if(str.length() == 1){
            return 0;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        if(chars[0] == chars[chars.length-1]){
            return chars.length-1;
        }
        chars = str.toCharArray();
        char sig=chars[0];
        int count = 0;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==sig){
                count++;
            }
            else{
                sig = chars[i];
            }
        }
        return count;
    }
}

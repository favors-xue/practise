package com.hackerrank.algorithms.implementation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by shawn on 15-10-19.
 */
public class CaesarCipher {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        String password = in.next();
        int sig = in.nextInt();
        char[] encrypt = new char[length];
        for(int i=0;i<length;i++){
            char c = password.charAt(i);
            Pattern pattern = Pattern.compile("[A-Za-z]");
            Matcher matcher = pattern.matcher(String.valueOf(c));
            if(matcher.matches()){
                if(c == 'z'){
                    c = (char)('a'-1);
                }
                else if (c == 'Z'){
                    c = (char)('A'-1);
                }
                encrypt[i] = (char)(c+sig);

            }
            else {

                encrypt[i] = c;
            }
        }
        for(char c : encrypt){
            System.out.print(c);
        }
    }
}

package com.algorithms.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by shawn on 15-10-19.
 */
public class Pangrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Map<Integer,String> container = new HashMap();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            Pattern p = Pattern.compile("[A-Za-z]");
            String letter = String.valueOf(c);
            Matcher matcher = p.matcher(letter);
            if(matcher.matches()){
                if(container.get((int)letter.toLowerCase().toCharArray()[0])==null){
                    container.put((int)letter.toLowerCase().toCharArray()[0],String.valueOf(c));
                }
                else{
                    continue;
                }
            }
            if(container.keySet().size()==26){
                System.out.println("pangram");
                break;
            }
        }
        if(container.keySet().size()<26){
            System.out.println("not pangram");
        }

    }
}

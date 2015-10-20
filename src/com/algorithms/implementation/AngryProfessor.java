package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by shawn on 15-9-30.
 */
public class AngryProfessor {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        boolean[] results = new boolean[2];

        String[] test = in.nextLine().split(" ");
        for(int i=0;i<length;i++){
            String[] classNumber = in.nextLine().split(" ");
            String[] stu = in.nextLine().split(" ");
            results[i] = getOnTime(stu,Integer.valueOf(classNumber[1]));
        }
        for(boolean b : results){
            System.out.println(b?"YES":"NO");
        }

    }

    private static boolean getOnTime(String[] stu,int min) {
        int count = 0;
        for(String s:stu){
            if(Integer.valueOf(s)>=0){
                count++;
                if(count>=min){
                    return false;
                }
            }
        }
        return true;
    }
}

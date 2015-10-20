package com.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by shawn on 15-9-29.
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String flag = str.substring(str.length() - 2, str.length());
        String[] hms = str.substring(0,str.length()-2).split(":");
        int hour = Integer.valueOf(hms[0]);
        if (hour == 12){
            hms[0] = flag.equalsIgnoreCase("PM")?"12":"00";
        }
        else {
            hms[0] = String.format("%02d", flag.equalsIgnoreCase("PM")?hour+12:hour);
        }
        System.out.println(hms[0]+":"+hms[1]+":"+hms[2]);
    }
}

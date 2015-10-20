package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by shawn on 15-9-29.
 */
public class LibraryFine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String actual = in.nextLine();
        String expect = in.nextLine();
        String[] actDMY = actual.split(" ");
        String[] expeDMY = expect.split(" ");
        System.out.println(caculate(actDMY,expeDMY));
    }

    private static int caculate(String[] actDMY, String[] expDMY) {
        int actY = Integer.valueOf(actDMY[2]);
        int expY = Integer.valueOf(expDMY[2]);
        int actM = Integer.valueOf(actDMY[1]);
        int expM = Integer.valueOf(expDMY[1]);
        int actD = Integer.valueOf(actDMY[0]);
        int expD = Integer.valueOf(expDMY[0]);

        if(expY > actY){
            return 0;
        }
        if(expY < actY){
            return 10000*(actY - expY);
        }
        if(expM > actM){
            return 0;
        }
        if(expM < actM){
            return 500*(actM - expM);
        }
        if(expD >= actD){
            return 0;
        }
        else {
            return 15*(actD - expD);
        }
    }
}

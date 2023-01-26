package com.dp.teori.tugaslooping1;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        int x,y;
        Scanner scn = new Scanner(System.in);
        System.out.println("input x y:");
        x = scn.nextInt();
        y = scn.nextInt();

        for (int i=0;i<y;i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 || j == 0 || i == y - 1 || j == x - 1)
                    System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}

package com.dp.teori.tugaslooping1;

import java.util.Scanner;

public class Temp5 {
    public static void main(String[] args) {
        int x,y;
        Scanner scn = new Scanner(System.in);
        System.out.println("input x:");
        x = scn.nextInt();
        System.out.println("input y:");
        y = scn.nextInt();
        int count = 1;
        char c = 65;

        for (int i = 1; i <= x; i++) {
            for (int a = 1; a <= y; a++) {
                for (int n = i; n < x; n++){
                    System.out.print(c);
                    c++;
                    if (c>90) c=65;
                }
                for (int j = 0; j < count; j++)
                    System.out.print("*");
                for (int n = i; n < x; n++){
                    System.out.print(c);
                    c++;
                    if (c>90) c=65;
                }
            }

            count += 2;
            System.out.println();
        }
    }
}

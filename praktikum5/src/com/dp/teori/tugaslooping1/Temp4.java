package com.dp.teori.tugaslooping1;

import java.util.Scanner;

public class Temp4 {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.println("input n:");
        n = scn.nextInt();

        if (n%2==0){
            for (int i=0;i<n;i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                        System.out.print(" * ");
                    else System.out.print("   ");
                }
                System.out.println();
            }
        }
        else {
            for (int i=0;i<n;i++){
                for (int j = 0; j < n; j++) {
                    if (i == 0 || j == 0 || i==j || i == n - 1 || j == n - 1 || i == n-1-j || j == n-1-i)
                        System.out.print(" * ");
                    else System.out.print("   ");
                }
                System.out.println();
            }
        }
    }
}

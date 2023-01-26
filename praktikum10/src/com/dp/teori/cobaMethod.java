package com.dp.teori;

import java.util.Scanner;

public class cobaMethod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*int x = scn.nextInt();
        System.out.printf("%d! = %d\n",x,factorial(x));
        System.out.printf("sum of all from 0 to %d = %d\n",x,sumOfAll(x));&*/
        println("allahuakbar ",12);

    }

    private static void println(String text) {
        System.out.println(text);
    }
    private static void println() {
        System.out.println();
    }
    private static void print(String text) {
        System.out.print(text);
    }
    private static void println(String text, int n) {
        for (int i=0;i<n;i++)
            System.out.println(text);
    }
    private static int factorial(int n) {
        if (n==0)
            return 1;
        else return n * factorial(n-1);
    }
    private static int sumOfAll(int n) {
        if (n==0)
            return 0;
        else return n + sumOfAll(n-1);
    }


}

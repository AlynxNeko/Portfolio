package com.dp.teori;

import java.util.Scanner;

public class Lewping {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char c = 'A';
        for (int i = 0;i<n; i++) {
            for (int k = 0; k <= i; k++) {
                if (c-65==n) break;
                System.out.print(c++);
                if (c == 91)
                    c = 'A';
                }
            if (c-65==n) break;
            System.out.println();
        }
    }
}


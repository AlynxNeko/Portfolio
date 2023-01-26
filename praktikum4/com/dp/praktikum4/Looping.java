package com.dp.praktikum4;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Masukkan batas: ");
        int n = scn.nextInt();

        int sum = 0;
        int i = 1;

        while (i<=n){
            System.out.print(i +" ");
            sum += i;
            i++;
        }

        System.out.println();
        i=1;

        do {
            System.out.print(i +" ");
            //sum += i;
            i++;
        }while (i<=n);

        System.out.println();

        for (i=1;i<=n;i++) {
            System.out.print(i + " ");
            //sum += i;
        }

        System.out.println();
        System.out.println(sum);
        }
    }


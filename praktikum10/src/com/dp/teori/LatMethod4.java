package com.dp.teori;

import java.util.Scanner;

public class LatMethod4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("input n: ");
        int n = scn.nextInt();
        int[] array = new int[n];

        int pil;
        do {
            System.out.println("1. Input data");
            System.out.println("2. Tampilkan data");
            System.out.println("3. Rata-rata data");
            System.out.println("4. Exit");
            pil = scn.nextInt();
            if (pil==1)
                inputArr(array);
            else if (pil==2)
                soutArr(array);
            else if (pil==3)
                System.out.println(average(array));

        } while (pil!=4);
        System.out.println("babai");
    }
    public static void soutArr(int[] array) {
        for (int el:array)
            System.out.print(el+" ");
        System.out.println();
    }
    public static void inputArr(int[] array) {
        for (int i=0;i<array.length;i++)
            array[i] = (int)(Math.random()*10);
    }
    public static double average(int[] arr) {
        double sum = 0;
        for (int el : arr)
            sum+=el;
        return sum/arr.length;
    }
}

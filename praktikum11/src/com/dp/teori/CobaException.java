package com.dp.teori;

import java.util.*;

public class CobaException {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = scn.nextInt();
            }catch (InputMismatchException e) {
                arr[i] = 0;
            }
        }
        System.out.println("input angka");
        int x;
        try {
            x = scn.nextInt();
        }catch (InputMismatchException e){
            x = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println(x / arr[i]);
            }catch (ArithmeticException e1){
                System.out.println("Eror"+e1);
            }
        }
    }
}

package com.dp.teori;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CobaEx3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = 9;

        try {
            int b = scn.nextInt();
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println("Peadwioj 0" + e);
        } catch (InputMismatchException e1){
            System.out.println("Angka weh");
        }
        System.out.println("asasdasd");
    }
}

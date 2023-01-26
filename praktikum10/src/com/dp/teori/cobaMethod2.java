package com.dp.teori;

import java.util.Scanner;

public class cobaMethod2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt(),
                y = scn.nextInt();
        System.out.println(luas(x,y));
    }

    private static int luas(int p, int l) {
        return p*l;
    }
}

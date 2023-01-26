package com.dp.teori.tugaslooping2;

import java.util.Scanner;

public class FPB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int bil1 = scn.nextInt();
        int bil2 = scn.nextInt();

        for (int i=1;i<=bil1;i++)
            if (bil1%i==0){
                for (int j=1;j<=bil2;j++)
                    if (bil2%j==0 && i==j)
                        System.out.println(j);
            }
    }
}

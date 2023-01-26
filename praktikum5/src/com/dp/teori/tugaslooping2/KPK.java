package com.dp.teori.tugaslooping2;

import java.util.Scanner;

public class KPK {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int bil1 = scn.nextInt();
        int bil2 = scn.nextInt();
        int kel1,kel2;
        int i=1,j=1;
        boolean isFinish=false;

        while (!isFinish){
            kel1 = bil1*i;
            while (true){
                kel2 = bil2*j;
                if (kel2>kel1)
                    break;
                if (kel2==kel1){
                    System.out.println(kel1);
                    isFinish = true;
                    break;
                }
                j++;
            }
            i++;
        }
    }
}

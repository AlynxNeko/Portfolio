package com.dp.praktikum5;

import java.util.Scanner;

public class nyoba {
        public static void main (String[]args){
            int n,x,y,z;
            Scanner scn = new Scanner(System.in);
            n = scn.nextInt();

            for (int i=0;i<n;i++){
                x = scn.nextInt();
                y = scn.nextInt();
                z = scn.nextInt();
                if (y>x)
                    System.out.println("Too Early");
                else if (z<x)
                    System.out.println("Too Late");
                else System.out.println("Take second dose now");
            }
        }
    }



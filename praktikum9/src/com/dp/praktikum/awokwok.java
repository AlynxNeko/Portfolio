package com.dp.praktikum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class awokwok {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true){
            list.add(1);
            int n = scn.nextInt();
            if (n==0)
                break;
            list.add(n);
        }
        list.forEach(e-> System.out.print(e + " "));
    }
}

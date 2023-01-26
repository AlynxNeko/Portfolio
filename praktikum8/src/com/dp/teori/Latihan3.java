package com.dp.teori;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("Subaru");
        list.add("Toyota");
        list.add("Corvette");

        list.add(0, scn.nextLine());
        for (String s:list)
            System.out.println(s);
    }
}

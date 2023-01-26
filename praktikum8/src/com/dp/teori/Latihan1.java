package com.dp.teori;

import java.util.*;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("how many colors: ");
        int n=scn.nextInt();
        scn.nextLine();
        List<String> color = new ArrayList<>();

        for (int i=0;i<n;i++)
            color.add(scn.next());

        System.out.println(color);

    }
}

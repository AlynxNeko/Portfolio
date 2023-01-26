package com.dp.teori;

import java.util.*;
public class CobaArrayList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List <String> list = new ArrayList<>();

        System.out.println("Nama: ");
        do {
            String n = scn.next();
            if (n.equals("###"))
                break;
            list.add(n);
        } while (true);

        System.out.print("{");
        for (int i=0;i<list.size();i++) {
            System.out.print(list.get(i));
            if (i< list.size()-1)
                System.out.print(", ");
        }
        System.out.print("}");
    }
}

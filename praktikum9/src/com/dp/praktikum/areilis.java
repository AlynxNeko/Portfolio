package com.dp.praktikum;

import java.util.ArrayList;
import java.util.List;

public class areilis {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(91);
        list.add(58);
        list.add(12);
        int a = 14;
        list.add(a);
        System.out.println("size: " + list.size());
        System.out.println("Angka ke 2: " + list.get(1));
        System.out.println(list);
        list.remove(2);
        for (int i:list)
            System.out.print(i + " ");
        System.out.println();
        list.add(2,13);
        System.out.println(list);
        list.set(1,16);
        System.out.println(list);
    }
}

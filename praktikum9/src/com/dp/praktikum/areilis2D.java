package com.dp.praktikum;

import java.util.ArrayList;
import java.util.List;

public class areilis2D {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();

        int[] a = new int[] {4,5};
        list.add(a);

        System.out.println(list.get(0)[0]);

        a = new int[] {8,5,7};
        list.add(a);

        for (int[] i:list) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }



    }
}

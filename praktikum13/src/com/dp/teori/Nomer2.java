package com.dp.teori;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Buat method yang mengeluarkan nilai terbesar ke-2 pada sebuah array!
Array bisa diberi nilai melalui inisialisasi spt pada contoh.
Contoh:
my_array = {1, 2, 5, 5, 6, 6, 7, 7, 2};
NIlai terbesar ke-2 adalah 6
 */
public class Nomer2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] myArr = {1, 2, 5, 5, 6, 6, 7, 2, 2,8};
        ArrayList<Integer> list = new ArrayList<>();
        for (int el : myArr)
            list.add(el);
        Collections.sort(list);
        int max = list.get(list.size() - 1);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < max) {
                System.out.println("Nilai terbesar ke-2 adalah " + list.get(i));
                break;
            }
        }
    }
}



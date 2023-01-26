package com.dp.teori;

import java.util.ArrayList;
import java.util.Scanner;

/*
Buat program untuk mencari nilai yang kembar dalam sebuah array 1 D.
Array bisa diberi nilai melalui inisialisasi spt pada contoh.
Contoh:
my_array = {1, 2, 5, 5, 6, 6, 7, 2, 2};
Output:
Nilai kembar = 2 5 6
*/
public class Nomer1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] myArr = {1, 2, 5, 5, 6, 6, 7, 2, 2,0,7};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < myArr.length-1; i++) {
            for (int j = i+1; j < myArr.length; j++) {
                if (myArr[i] == myArr[j])
                    if (!list.contains(myArr[i]))
                        list.add(myArr[i]);
            }
        }
        System.out.print("Nilai kembar = ");
        for (Integer el : list) {
            System.out.print(el+" ");
        }
    }
}

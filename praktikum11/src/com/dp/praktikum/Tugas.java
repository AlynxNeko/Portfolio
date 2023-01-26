package com.dp.praktikum;

import java.util.ArrayList;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        //deklarasi dan input
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan angka-angka (pisahkan dengan spasi): ");
        String angkas = scn.nextLine();
        System.out.print("Masukkan angka pembagi: ");
        int div = scn.nextInt();
        //mengubah string jadi array of numbers
        int[] arr = convertStringtoArray(angkas);

        //eksekusi
        int[][] hasil = divider(arr,div);

        //print array
        System.out.print("Angka-angka lebih kecil: ");
        for (int i = 0; i < hasil.length; i++) {
            if (i==1)
                System.out.print("Angka-angka lebih besar: ");
            for (int j = 0; j < hasil[i].length; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
        Runtime rt = Runtime.getRuntime();
        long total_mem = rt.totalMemory();
        long free_mem = rt.freeMemory();
        long used_mem = total_mem - free_mem;
        System.out.println("Amount of used memory: " + used_mem);
    }

    public static int[][] divider(int[] arr, int div) {
        //harusnya bisa pakai 1 list pake list.clear();
        ArrayList<Integer> smol = new ArrayList<>();
        ArrayList<Integer> beeg = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (x<div){
                smol.add(x);
            } else {
                beeg.add(x);
            }
        }

        //harusnya bisa bikin method lagi tapi disuruhnya 2 jadi yaudah
        //ngubah list jadi array biasa
        int[] small = new int[smol.size()];
        for (int i = 0; i < smol.size(); i++) {
            small[i] = smol.get(i);
        }

        //ngubah list jadi array biasa
        int[] big = new int[beeg.size()];
        for (int i = 0; i < beeg.size(); i++)
            big[i] = beeg.get(i);

        return new int[][]{small,big};
    }

    public static int[] convertStringtoArray(String text) {
        String[] strs = text.split(" ");
        int[] arr = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        return arr;
    }
}

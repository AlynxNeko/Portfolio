package com.dp.praktikum;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas {

    public static
    ArrayList<String> list = new ArrayList<>();
    public static
    ArrayList<String> list2 = new ArrayList<>();
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int pil = 0;
        System.out.println("Menu:\n" +
                "1. Buat Grup Baru\n" +
                "2. Simpan Grup Ke File\n" +
                "3. Ambil Grup Dari File\n" +
                "4. Exit");
        do {
            try {
                System.out.print("Masukkan pilihan: ");
                pil = scn.nextInt();
                scn.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Terjadi kesalahan -> " + e.getMessage());
                pil = 0;//supaya ke reset
            }
            if (pil == 1)
                buatGrup();
            try {
                if (pil == 2)
                    simpanGrup();
                if (pil == 3)
                    bacaGrup();
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan -> " + e.getMessage());
            }

            System.out.println();
        } while (pil != 4);
        System.out.println("Terima kasih");
    }

    private static void bacaGrup() throws FileNotFoundException {
        System.out.print("Masukkan nama file: ");
        String namaFile = scn.nextLine();
        File file = new File(namaFile);
        Scanner fscn = new Scanner(file);
        while (fscn.hasNext())
            list2.add(fscn.nextLine());
        fscn.close();

        System.out.printf("Daftar nama anggota di %s:\n", namaFile);
        for (String s : list2) {
            System.out.print(s + " ");
        }
        System.out.println();
        list2.clear();
    }

    private static void simpanGrup() throws IOException {
        System.out.print("Masukkan nama file: ");
        String namaFile = scn.nextLine();
        FileWriter fwrite = new FileWriter(namaFile, false);
        PrintWriter pwrite = new PrintWriter(fwrite);
        for (String s : list) {
            pwrite.println(s.trim());
        }
        pwrite.close();
        System.out.printf("Grup telah disimpan ke file %s!\n", namaFile);
    }

    private static void buatGrup() {
        list.clear();
        System.out.print("Masukkan nama-nama anggota (dipisah dengan koma): ");
        String nama = scn.nextLine();
        for (String s : nama.split(",")) {
            list.add(s.trim());
        }
        System.out.println("Grup telah dibuat!");
    }
}

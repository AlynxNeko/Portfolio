package com.dp.praktikum;

import java.util.ArrayList;
import java.util.Scanner;

//Buatlah program dengan ArrayList untuk menyimpan data deret angka dengan fitur menambah, menghapus, dan mengubah berdasarkan inputan user, dengan menu seperti dibawah ini:
//
//Jumlah data:  0
//1. Tambah data
//2. Ubah data
//3. Hapus data
//4. Cetak data
//
//Jika dipilih 1:
//Masukkan angka: 5
//
//
//Jumlah data:  1
//1. Tambah data
//2. Ubah data
//3. Hapus data
//4. Cetak data
//
//
//Jika dipilih 2 akan mencari angka yang diinput dan mengubah semua angka yg diinput tersebut:
//Masukkan angka yang ingin diubah: 5
//Angka ditemukan
//Ubah menjadi: 7
//
//
//Jumlah data:  1
//1. Tambah data
//2. Ubah data
//3. Hapus data
//4. Cetak data
//Jika dipilih 3 akan menghapus semua angka yg diinput tersebut:
//Masukkan angka yang ingin dihapus: 7
//Angka ditemukan dan dihapus!
//
//Jumlah data:  0
//1. Tambah data
//2. Ubah data
//3. Hapus data
//4. Cetak data
//
//
//Jika dipilih 4 maka akan mencetak deret angka yang tersimpan
//Jika angka yang dicari saat ingin mengubah atau menghapus tidak
// ditemukan maka akan menampilkan pesan "Angka tidak ditemukan"
public class Tugas {
    public static void main(String[] args) {
        //deklarasi
        Scanner scn =new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int choice;
        do {
            System.out.println("Jumlah data: " + list.size());
            System.out.println("""
                    1. Tambah data
                    2. Ubah data
                    3. Hapus data
                    4. Cetak data""");
            choice = scn.nextInt();
            if (choice == 1) {
                System.out.print("Masukkan angka: ");
                list.add(scn.nextInt());
            }
            if (choice == 2) {
                System.out.print("Masukkan angka yang ingin diubah: ");
                int temp = scn.nextInt();
                if (list.contains(temp)) {
                    System.out.print("Angka ditemukan\nUbah menjadi: ");
                    int temp2 = scn.nextInt();
                    for (int i = 0; i < list.size(); i++)
                        if (list.get(i) == temp)
                            list.set(i,temp2);
                }
                else System.out.println("Angka tidak ditemukan");
            }
            if (choice == 3) {
                System.out.print("Masukkan angka yang ingin dihapus: ");
                int temp = scn.nextInt();
                if (list.contains(temp))
                    System.out.print("Angka ditemukan dan dihapus");
                else System.out.println("Angka tidak ditemukan");
                while (list.contains(temp)) {
                    list.remove(list.indexOf(temp));
                }
            }

            System.out.println();
        } while (choice!=4);
        System.out.println("Data: ");
        for (int i:list)
            System.out.print(i+" ");
        list.forEach(e-> System.out.print(e+" "));
    }
}

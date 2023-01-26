package com.dp.praktikum;

import java.util.ArrayList;
import java.util.Scanner;

public class PR {
    static ArrayList<ArrayList<String>> listName = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int pil;
        System.out.println(listName);
        do {
            System.out.println("1. Cetak nama-nama semua tim yang ada\n" +
                    "2. Cetak anggota tim\n" +
                    "3. Tambah tim baru\n" +
                    "4. Tambah anggota tim\n" +
                    "5. Cari anggota tim\n" +
                    "6. Hapus anggota tim\n" +
                    "7. Exit");
            pil = scn.nextInt();
            scn.nextLine();
            if (pil==1) { //cetak semua nama tim
                for (int i = 0;i< listName.size();i++) {
                    if (i>0)
                        System.out.print(", ");
                    System.out.print(listName.get(i).get(0));
                }
            }
            if (pil==2) { //Cetak anggota tim
                System.out.print("Nama Tim: ");
                cetakTim(scn.nextLine());
            }
            if (pil==3) { //Tambah tim baru
                System.out.print("Nama Tim Baru: ");
                String groupName = scn.nextLine();
                System.out.print("Nama Ketua Baru: ");
                String name = scn.nextLine();
                tambahTim(groupName,name);
            }
            if (pil==4) { //Tambah anggota tim
                System.out.print("Nama Tim: ");
                String groupName = scn.nextLine();
                System.out.print("Nama Anggota Baru: ");
                String newName = scn.nextLine();
                tambahAnggota(groupName,newName);
            }
            if (pil==5) { //Cari anggota tim
                System.out.println("Nama Anggota: ");
                String name = scn.nextLine();
                System.out.println(cariTim(name));
            }
            if (pil==6) { //Hapus anggota tim
                System.out.println("Nama Anggota Yang Dihapus: ");
                String name = scn.nextLine();
                hapusAnggota(name);
            }
            System.out.println();
        }while (pil!=7);
    }

    private static void hapusAnggota(String name) {
        for (int i = 0; i < listName.size(); i++) {
            int x = listName.get(i).size();
            for (int j = 1; j < x; j++) {
                String nama = listName.get(i).get(j);
                if (nama.equalsIgnoreCase(name)) {
                    listName.get(i).remove(j);
                    System.out.printf("menghapus %s dari tim %s",nama,listName.get(i).get(0));
                    break;
                }
            }
        }
    }

    private static String cariTim(String name) {
        String groupName = "";
        for (int i = 0; i < listName.size(); i++) {
            for (int j = 1; j < listName.get(i).size(); j++) {
                if (listName.get(i).get(j).equalsIgnoreCase(name)) {
                    groupName = listName.get(i).get(0);
                    break;
                }
            }
        }
        return groupName;
    }

    private static void tambahAnggota(String groupName, String newName) {
        boolean is = false;
        for (int i = 0; i < listName.size(); i++) {
            if (groupName.equalsIgnoreCase(listName.get(i).get(0))) {
                listName.get(i).add(newName);
                is = true;
                System.out.printf("Menambah anggota tim %s dengan %s",groupName,newName);
            }
        }
        if (!is)
            System.out.print("--Invalid Team Name--");
    }

    public static void cetakTim(String groupName) {
        for (int i = 0; i < listName.size(); i++) {
            if (groupName.equalsIgnoreCase(listName.get(i).get(0)))
                for (int j = 1; j < listName.get(i).size(); j++) {
                    if (j>1)
                        System.out.print(", ");
                    System.out.print(listName.get(i).get(j));
                }
        }
    }

    public static void tambahTim(String groupName, String name) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> group = new ArrayList<>();
        group.add(groupName);
        group.add(name);
        listName.add(group);
        System.out.printf("menambah tim baru bernama tim %s dengan anggota pertama %s",groupName,name);
    }
}

package com.dp.praktikum;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int pil;
        System.out.println("""
                Menu program:
                1. Input nilai siswa
                2. Cetak nilai siswa dan rata-rata
                3. Exit""");
        do {
            try {
                System.out.print("Masukkan pilihan: ");
                pil = scn.nextInt();
                System.out.println();
            } catch (InputMismatchException e){
                printError("Input salah!");
                pil = 0;
            }
            scn.nextLine();

            if (pil == 1) {
                System.out.print("Masukkan NRP: ");
                String nrp = scn.nextLine();
                System.out.print("Masukkan nilai: ");
                String nilai = scn.nextLine();
                try {
                    ArrayList<Integer> nilais = inputNilai(nilai);
                    simpanNilai(nrp,nilais);
                } catch (IOException e) {
                    printError(e.getMessage());
                } catch (NumberFormatException e) {
                    printError("Input nilai salah!");
                }
            } if (pil == 2) {
                System.out.print("Masukkan NRP: ");
                String nrp = scn.nextLine();
                try {
                    ArrayList<Integer> list = bacaNilai(nrp);
                    for (Integer in : list) {
                        System.out.println(in);
                    }
                    cetakRataRata(list);
                } catch (FileNotFoundException e) {
                    printError("File tidak ditemukan");
                }
                System.out.println();
            }
        } while (pil != 3);
        System.out.println("babai..");
    }

    private static void cetakRataRata(ArrayList<Integer> list) {
        float count = 0f;
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
            count++;
        }
        System.out.println(sum/count);
    }

    private static ArrayList<Integer> bacaNilai(String nrp) throws FileNotFoundException, NumberFormatException {
        ArrayList<Integer> list = new ArrayList<>();
        File file = new File("nilai/"+nrp+".txt");
        Scanner fscn = new Scanner(file);
        System.out.printf("Sukses mengambil nilai dari file %s\n","nilai/"+nrp+".txt");
        System.out.println("Nilai siswa dengan NRP: " + nrp);
        while (fscn.hasNext()) {
            int temp = Integer.parseInt(fscn.nextLine());
            list.add(temp);
        }
        return list;
    }

    private static void simpanNilai(String nrp, ArrayList<Integer> nilais) throws IOException {
        nrp = "nilai/"+nrp+".txt";
        FileWriter fwrite = new FileWriter(nrp,false);
        PrintWriter pwrite = new PrintWriter(fwrite);
        for (Integer nilai : nilais) {
            pwrite.println(nilai);
        }
        pwrite.close();
        System.out.printf("Nilai telah disimpan ke file %s\n",nrp);
    }

    private static ArrayList<Integer> inputNilai(String nilai) throws NumberFormatException {
        ArrayList<Integer> nilais = new ArrayList<>();
        for (String s : nilai.split(" ")) {
            nilais.add(Integer.parseInt(s));
        }
        return nilais;
    }

    private static void printError(String message) {
        System.out.println("Terjadi kesalahan -> " + message);
    }
}

package com.dp.praktikum;

import java.util.Scanner;

//Buatlah sebuah program untuk mendata dan menghitung nilai akhir seorang mahasiswa
//
//Adapun nilai yang diinput adalah:
//5 nilai Tugas (bobot setelah dirata2 adalah 25% dari nilai akhir)
//1 nilai Quiz (bobot 15% dari nilai akhir)
//1 nilai UTS (bobot 30% dari nilai akhir)
//1 nilai UAS (bobot 30% dari nilai akhir)
//
//Apabila nilai akhir kurang dari 70 maka Dosen dapat membantu mahasiswa dengan cara:
//- Menambah MASING MASING nilai tugas ke kelipatan 5 terdekat dengan nilai maksimum 70
//(contoh: nilai 62 jadi 65, nilai 50 tetap 50, nilai 72 tidak berubah)
//- Nilai quiz tidak berubah
//- Menambah nilai UTS dan UAS dengan 10% dengan nilai maksimum 70
//(contoh: nilai 60 jadi 66, nilai 65 jadi 70 karena maksimum)
//
//Program akan menampilkan nilai sebelum dibantu dan setelah dibantu (jika ada):
//Contoh output:
//Nama Mahasiswa: Joni
//Nilai Tugas: 62 50 38 64 36
//Nilai Rata2 Tugas: 50
//Nilai Quiz: 30
//Nilai UTS: 30
//Nilai UAS: 30
//Nilai Akhir:  35
//
//NILAI DIBANTU:
//Nilai Tugas: 65 50 40 65 40
//Nilai Rata2 Tugas: ... (dan seterusnya)
//
//GUNAKAN HANYA 2 ARRAY
//1 ARRAY UNTUK NILAI ASLI
//1 ARRAY UNTUK NILAI DIBANTU
//JANGAN GUNAKAN VARIABEL TAMBAHAN JIKA TIDAK PERLU
public class Tugas {
    public static void main(String[] args) {
        //deklarasi
        Scanner scn = new Scanner(System.in);
        double[] nilaiAsli = new double[8];
        double[] nilaiGanti = new double[8];
        float nilaiAkhir = 0;

        System.out.print("Nama Mahasiswa: ");
        String name = scn.nextLine();

        //input array
        for (int i = 0; i < nilaiAsli.length; i++) {
            if (i < 5)
                System.out.println("Masukkan nilai ke-" + (i + 1));
            else if (i == 5)
                System.out.println("Masukkan nilai Quiz");
            else if (i == 6)
                System.out.println("Masukkan nilai UTS");
            else
                System.out.println("Masukkan nilai UAS");
            nilaiAsli[i] = scn.nextDouble();
        }
        //eksekusi
        System.out.println("Nama Mahasiswa: " + name);
        System.out.print("Nilai Tugas: ");
        for (int i = 0; i < nilaiAsli.length; i++) {
            if (i < 5) {
                nilaiAkhir += nilaiAsli[i] / 5.0;
                System.out.print(nilaiAsli[i] + " ");
                if (i == 4) {
                    System.out.println();
                    System.out.printf("Nilai Rata2 Tugas: %.2f\n", nilaiAkhir);
                    nilaiAkhir *= 0.25;
                }
            } else if (i < 6) {
                nilaiAkhir += nilaiAsli[i] * 0.15;
                System.out.println("Nilai Quiz: " + nilaiAsli[i]);
            } else if (i < 7) {
                nilaiAkhir += nilaiAsli[i] * 0.3;
                System.out.println("Nilai UTS: " + nilaiAsli[i]);
            } else {
                nilaiAkhir += nilaiAsli[i] * 0.3;
                System.out.println("Nilai UAS: " + nilaiAsli[i]);
            }
        }
        System.out.printf("Nilai AKhir: %.2f\n",nilaiAkhir);

        //adawdawdawdawdawdawd
        if (nilaiAkhir < 70) {
            //eksekusi
            for (int i = 0; i < nilaiGanti.length; i++) {
                if (i<6) {
                    if (nilaiAsli[i] < 70 && nilaiAsli[i] % 5 != 0)
                        nilaiGanti[i] = nilaiAsli[i] + 5 - (nilaiAsli[i] % 5);
                    else
                        nilaiGanti[i] = nilaiAsli[i];
                }
                else if (nilaiAsli[i] < 70)
                    nilaiGanti[i] = nilaiAsli[i] + (nilaiAsli[i]*0.1);
                else
                    nilaiGanti[i] = nilaiAsli[i];
            }

            System.out.println();
            System.out.println("Nilai Ganti");
            System.out.print("Nilai Tugas: ");
            nilaiAkhir=0;
            for (int i = 0; i < nilaiAsli.length; i++) {
                if (i < 5) {
                    nilaiAkhir += nilaiGanti[i] / 5.0;
                    System.out.print(nilaiGanti[i] + " ");
                    if (i == 4) {
                        System.out.println();
                        System.out.println("Nilai Rata2 Tugas: " + nilaiAkhir);
                        nilaiAkhir *= 0.25;
                    }
                }
                else if (i < 6) {
                    nilaiAkhir += nilaiAsli[i] * 0.15;
                    System.out.println("Nilai Quiz: " + nilaiAsli[i]);
                }
                else if (i < 7) {
                    nilaiAkhir += nilaiGanti[i] * 0.3;
                    System.out.println("Nilai UTS: " + nilaiGanti[i]);
                }
                else {
                    nilaiAkhir += nilaiGanti[i] * 0.3;
                    System.out.println("Nilai UAS: " + nilaiGanti[i]);
                }
            }
            System.out.printf("Nilai AKhir: %.2f\n",nilaiAkhir);

        }
    }
}

package com.dp.teori;

import java.util.Scanner;

public class wakaranai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Bagian Deklarasi Variable
        String nama;
        int total =0;
        double rataRata;

        // Bagian Input
        System.out.print("Masukkan Nama Mahasiswa: ");
        nama = sc.nextLine();
        double [] nilai = new double[8];
        for (int i = 0; i <= 4; i++) {
            System.out.print("Nilai Tugas ke- " + (i+1) + ": ");
            nilai[i] = sc.nextDouble();
            total += nilai[i];
        }
        for (int j = 5; j <= 7 ; j++ ) {
            if (j == 5) {
                System.out.print("Nilai Quiz: ");
            } else if (j == 6) {
                System.out.print("Nilai UTS: ");
            } else  {
                System.out.print("Nilai UAS: ");
            }
            nilai[j]= sc.nextDouble();

        }
        // Bagian Eksekusi
        double nilaiAkhir = 0;
        System.out.print("Nilai tugas: ");
        for (int i=0;i< nilai.length;i++)
        {
            //buat nilai tugas sama rata2 tugas
            if (i<5) {
                nilaiAkhir += nilai[i] / 5;
                System.out.print(nilai[i]);
                if (i==4) {
                    System.out.println("Nilai rata2: " + nilaiAkhir);
                    nilaiAkhir *= 0.25;
                }
            }
            //lanjutiin lain e
        }
        rataRata = total /5.0;
        double nilai5 = rataRata * 25/100;
        double nilaiBobot = (nilai[5] * 15/100) + (nilai[6] * 30/100) + (nilai[7] * 30/100);

        System.out.println("Nilai Akhir: " + nilaiAkhir);

        // Array nilai yang dibantu
        System.out.println();
        System.out.println("NILAI DIBANTU:");
        if (nilaiAkhir < 70){

        }


        // Bagian Output
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Tugas: " + nilai[1] );
    }
}

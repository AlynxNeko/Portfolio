package com.dp.praktikum4;

//Buatlah program yang menerima input 3 nilai:
//Nilai UTS
//Nilai UAS
//Nilai Tugas
//
//Kemudian buatlah kondisi untuk mencetak nilai hurufnya berdasarkan rata-rata ketiga nilai tadi:
//Nilai 90 keatas: A
//Nilai 70 keatas: B
//Nilai 50 keatas: C
//Dibawah 50: D
//Lalu hasilkan output menyatakan mahasiswa lulus atau tidak dengan syarat:
//Nilai minimal C
//Nilai UTS dan UAS tidak boleh ada yang dibawah 55
//Buatlah flag (minimal 2) untuk mencatat mahasiswa lulus atau tidak, dan mencatat apakah nilai uts / uas memenuhi syarat, dan keperluan lain
//Buatlah coding dengan rapi dan terdokumentasi dengan baik, mengikuti standar Java Convention, dan kelompokkan baris kode secara terorganisir (semua output dibawah, dsb)
//
//Contoh 1:
//Masukkan nilai UTS: 70
//Masukkan nilai UAS: 70
//Masukkan nilai Tugas: 60
//
//Output 1:
//Nilai anda: C
//Anda dinyatakan lulus
//
//Contoh 2:
//Masukkan nilai UTS: 70
//Masukkan nilai UAS: 50
//Masukkan nilai Tugas: 85
//
//Output 2:
//Nilai anda: C
//Anda dinyatakan tidak lulus, karena nilai UTS atau UAS dibawah 55

import java.util.Scanner;

public class PR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //deklarasi dan input
        double nilai;
        String huruf;
        boolean isMin55 = false;
        boolean isMinC = true;

        System.out.println("Masukkan nilai UTS: ");
        double nilaiUTS = scn.nextInt();
        System.out.println("Masukkan nilai UAS: ");
        double nilaiUAS = scn.nextInt();
        System.out.println("Masukkan nilai Tugas: ");
        double nilaiTugas = scn.nextInt();

        //eksekusi
        nilai = (nilaiTugas + nilaiUAS + nilaiUTS)/3.0;

        //if elseif else
        //part 1
        if (nilaiUTS >= 55 && nilaiUAS >= 55)
            isMin55 = true;
        //part 2
        if (nilai>=90)
            huruf = "A";
        else if (nilai>=70)
            huruf = "B";
        else if (nilai>=50)
            huruf = "C";
        else {
            huruf = "D";
            isMinC = false;
        }

        //output
        System.out.println("Nilai anda: " + huruf);
        if (!isMin55 && !isMinC)
            System.out.println("Anda dinyatakan tidak lulus, karena nilai UTS atau UAS dibawah 55 dan nilai rata-rata anda D");
        else if (!isMin55)
            System.out.println("Anda dinyatakan tidak lulus, karena nilai UTS atau UAS dibawah 55");
        else if (!isMinC)
            System.out.println("Anda dinyatakan tidak lulus, karena nilai rata-rata anda dibawah C");
        else
            System.out.println("Anda dinyatakan lulus");

    }
}

package com.dp.praktikum;
//Buatlah program kasir minimarket untuk menghitung total pembelian barang dimana
// pembeli datang dengan barang-barang yang dibeli. Program menginput harga barang
// sampai tidak ada barang lagi.
//Untuk total pembelian diberikan diskon 5%
//
//Cetak outputnya dengan baik (gunakan decimal format dan / atau printf)
//
//Contoh:
//Masukkan harga barang: 5000
//Masih ada barang? (Y/N) Y
//Masukkan harga barang: 10000
//Masih ada barang? N
//
//Total harga  :  Rp. 15,000.00
//Diskon          :  Rp.      750.00
//Pembayaran:  Rp. 14,250.00
//
//Terima kasih telah berkunjung
//Pembeli berikutnya? (Y/N)

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat myF = new DecimalFormat("#,##0.00");
        int pilihan;
        String yorn;
        double disc = 0.05,total,totalAkhir,totalPendapatan=0;

        do {
            do {
                System.out.print("Selamat datang di Minimarket\n" +
                        "1. Layani pembeli\n" +
                        "2. Tutup\n" +
                        "Masukkan pilihan: ");
                pilihan = scn.nextInt();
            }while (pilihan>2||pilihan<1);//ini aslinya nda perlu (jump to comment line 60)

            if (pilihan == 1){
                total = 0;
                do {
                    System.out.print("Masukkan harga barang: ");
                    total += scn.nextDouble();
                    scn.nextLine();
                    System.out.print("Masih ada barang? (Y/N) ");
                    yorn = scn.nextLine();
                } while (yorn.equalsIgnoreCase("Y"));

                totalAkhir = total - (total*disc);
                System.out.printf("Total harga  :  Rp. %10s\n",myF.format(total));
                System.out.printf("Diskon       :  Rp. %10s\n",myF.format(total*disc));
                System.out.printf("Pembayaran   :  Rp. %10s\n",myF.format(totalAkhir));
                System.out.println("Terima kasih telah berkunjung\n");
                totalPendapatan += totalAkhir;
            }

        } while (pilihan == 1); //harusnya bisa while pilihan != 2
        System.out.println("Toko tutup");
        System.out.printf("Pendapatan hari ini: Rp. %s\n", myF.format(totalPendapatan));
    }
}

// kalo mau nge print 1 milliar angka pake %,14.2f


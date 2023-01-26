package com.dp.praktikum5;
//Buatlah program kasir untuk berjualan nasi goreng. Harga nasi goreng biasa adalah Rp. 10000.
// Pada menu utama ditanyakan apakah ingin menginput penjualan atau akhiri berjualan.
// Untuk setiap pembeli diberikan menu pilihan: Nasi goreng biasa, Nasi goreng spesial (Harga +3000),
// Nasi goreng jumbo (Harga +5000), atau Selesai untuk mengakhiri pesanan pembeli. dan ditanyakan
// jumlah pembeliannya. Setelah itu program akan menampilkan uang yang harus dibayar pembeli.
//
//
//Pada akhir pembelian program akan kembali ke menu utama.
//Apabila user mengakhiri berjualan maka akan dicetak pendapatan hari itu, jumlah pelanggan
// dan rata-rata pendapatan dari setiap pelanggan.
//
//Contoh:
//Menu utama:
//1. Input penjualan
//2. Akhiri berjualan
//Masukkan pilihan: 1
//
//
//Menu pesanan:
//1. Nasi goreng biasa
//2. Nasi goreng spesial
//3. Nasi goreng jumbo
//4. Selesai
//Masukkan pilihan: 1
//Masukkan jumlah: 2
//
//Menu pesanan:
//1. Nasi goreng biasa
//2. Nasi goreng spesial
//3. Nasi goreng jumbo
//4. Selesai
//Masukkan pilihan: 4
//Total yang harus dibayar: Rp 20000
//
//Menu utama:
//1. Input penjualan
//2. Akhiri berjualan
//Masukkan pilihan: 1
//
//Menu pesanan:
//1. Nasi goreng biasa
//2. Nasi goreng spesial
//3. Nasi goreng jumbo
//4. Selesai
//Masukkan pilihan: 1
//Masukkan jumlah: 1
//
//
//Menu pesanan:
//1. Nasi goreng biasa
//2. Nasi goreng spesial
//3. Nasi goreng jumbo
//4. Selesai
//Masukkan pilihan: 3
//Masukkan jumlah: 1
//
//Menu pesanan:
//1. Nasi goreng biasa
//2. Nasi goreng spesial
//3. Nasi goreng jumbo
//4. Selesai
//Masukkan pilihan: 4
//Total yang harus dibayar: Rp 25000
//
//Menu utama:
//1. Input penjualan
//2. Akhiri berjualan
//Masukkan pilihan: 2
//Total pendapatan hari ini: Rp 45000
//Jumlah pelanggan: 2
//Rata-rata pendapatan per pelanggan:  Rp 22500
//
//Timothy Gilbert H
// c14220108
import java.util.Scanner;

public class PR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input, inputMakanan,totalSemua=0;
        int harga = 10000;
        int rata, buyer=0;
        boolean isValid, isValid2, isValid3;

        for(int i=0;i<1;) {
            int total = 0, jumlah = 0;
            do {// check kalo gaada di pilihan, diulang
                isValid = true;
                System.out.print("Menu utama:\n" +
                        "1. Input penjualan\n" +
                        "2. Akhiri berjualan\n" +
                        "Masukkan pilihan: ");
                input = scn.nextInt();
                if (input < 1 || input > 2) {
                    isValid = false;
                    System.out.println("Pilihan tersebut tidak ada di dalam menu...");

                }
                System.out.println();
            } while (!isValid);

            switch (input) {
                case 1: {
                    for (int j = 0; j < 1; ) {
                        do {// check kalo gaada di pilihan, diulang
                            isValid2 = true;
                            System.out.print("Menu pesanan:\n" +
                                    "1. Nasi goreng biasa\n" +
                                    "2. Nasi goreng spesial\n" +
                                    "3. Nasi goreng jumbo\n" +
                                    "4. Selesai\n" +
                                    "Masukkan pilihan: ");
                            inputMakanan = scn.nextInt();

                            if (inputMakanan < 1 || inputMakanan > 4) {
                                isValid2 = false;
                                System.out.println("Pilihan tersebut tidak ada di dalam menu...");
                            }
                        } while (!isValid2);

                        if (inputMakanan!=4) {
                            do { //kan ga mungkin beli makanan mines
                                isValid3 = true;
                                System.out.print("Masukkan jumlah: ");
                                jumlah = scn.nextInt();
                                if (jumlah < 0) {
                                    isValid3 = false;
                                    System.out.println("...");
                                }
                            } while (!isValid3);

                            System.out.println();
                        }

                        switch (inputMakanan) {//nambahin total harga
                            case 1: {
                                total += harga * jumlah;
                                break;
                            }
                            case 2: {
                                total += (harga + 3000) * jumlah;
                                break;
                            }
                            case 3: {
                                total += (harga + 5000) * jumlah;
                                break;
                            }
                            case 4: {
                                j++;
                                System.out.println("Total yang harus dibayar: Rp " + total);
                                System.out.println();
                                buyer++;
                                break;
                            }
                        }

                    }
                    break;
                }
                case 2: {
                    i++;
                    break;
                }
            }
            totalSemua += total;
        }
        rata = totalSemua / buyer;
        System.out.println("Total pendapatan hari ini: Rp " + totalSemua + "\n" +
                "Jumlah pelanggan: " + buyer + "\n" +
                "Rata-rata pendapatan per pelanggan:  Rp " + rata);
    }
}

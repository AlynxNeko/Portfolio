package com.dp.praktikum;

public class BelajarPrintf {
    public static void main(String[] args) {
        String nama = "Timothy";
        int umur = 18;
        String noHp = "081269420911";
        double gaji = 123456789.8743;

        System.out.printf("Halo namaku %s, aku berumur %d tahun, no telp %s\n", nama, umur, noHp);
        System.out.println("Halo namaku " + nama + ", aku berumur " + umur + " tahun, no telp " + noHp);

        System.out.printf("Nama          = %15s\n",nama);
        System.out.printf("Umur          = %15d\n",umur);
        System.out.printf("Nomor Telepon = %15s\n",noHp);
        System.out.printf("Gaji          = %,16.2f\n",gaji);
                    //karena ada ',' nya jadi supaya aman digitnya tambah 1
    }
    /* paling sering digunakan
    * %s untuk string
    * %d untuk integer
    * %f untuk float
    * */

}

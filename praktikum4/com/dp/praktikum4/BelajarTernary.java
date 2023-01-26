package com.dp.praktikum4;

public class BelajarTernary {
    public static void main(String[] args) {
        int nilai = 65;
        String hasil = (nilai > 50) ? "lulus" : "gagal;";
        // Ternary -----  condition ? if true : else
        System.out.println(hasil);

        //ternary di dalem sout
        System.out.println("Anda " + ((nilai > 50) ? "lulus" : "gagal;"));
    }
}

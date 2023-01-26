package com.dp.praktikum;

import java.text.DecimalFormat;

public class BelajarDecimal {
    public static void main(String[] args) {
        DecimalFormat myFormat = new DecimalFormat("#,##0.00");

        double angka1 = 146321241.774;
        double angka2 = 12432.345;
        double angka3 = 1337.31;
        double angka4 = 1.12;

        //kalo di format jadi string
        String angkafor1 = myFormat.format(angka1);

        System.out.println(angka1 + " -> " + angkafor1);
        System.out.println(angka2 + " -> " + myFormat.format(angka2));
        System.out.println(angka3 + " -> " + myFormat.format(angka3));
        System.out.println(angka4 + " -> " + myFormat.format(angka4));
    }
}

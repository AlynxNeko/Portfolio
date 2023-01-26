package com.dp.praktikum4;

public class BelajarNestedIf {
    public static void main(String[] args) {
        int angka = 14;
        boolean isGenap=false;

        if (angka > 10) {
            System.out.println("Angka besar");
            if (angka%2==0)
                isGenap = true;
        }
        else {
            System.out.println("Angka kecil");
            if (angka%2==0)
                isGenap = true;
        }
        if (isGenap) System.out.println("Angka genap");
        else System.out.println("Angka ganjil");
    }
}

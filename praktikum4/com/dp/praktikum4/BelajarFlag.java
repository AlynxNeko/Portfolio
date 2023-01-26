package com.dp.praktikum4;

public class BelajarFlag {
    public static void main(String[] args) {
        String hari = "Kamis";

        int tanggal = 13;

        boolean isTege = false; //flag
        if (hari =="Jumat" || tanggal == 14) {
            isTege = true; //raise flag if contidion is true
        }
        //flag checking
        if (isTege) System.out.println("Tege hadir");
        if (!isTege) System.out.println("Tege nda hadir");
    }
}

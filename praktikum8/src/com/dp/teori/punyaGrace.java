package com.dp.teori;

import java.util.Scanner;

public class punyaGrace {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Merupakan scanner berupa scn

        // Bagian Deklarasi Variable
        int baris,kolom,pilihan;

        // Bagian Input sumbu x dan y berupa intejer bilangan bulat positif
        System.out.print("Input sumbu x: ");
        baris = scn.nextInt();
        System.out.print("Input sumbu y: ");
        kolom = scn.nextInt();

        // Bagian Input angka yang diisi ke dalam matrix
        int [][] matrix = new int[baris][kolom];
        for (int i = 0 ; i < baris ; i++){
            System.out.println("Deret ke-" + (i+1));
            for (int j = 0 ; j < kolom ; j++){
                matrix[i][j] = Math.abs(scn.nextInt());
            }
        }

        // Bagian Eksekusi dan Output matrix awal
        while (true){
            System.out.println();
            System.out.println("Matrix: ");
            for (int i = 0 ; i< baris; i++){
                for (int j = 0 ; j < kolom ; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            // Bagian Input pilihan yang dipilih dari menu
            System.out.println();
            System.out.println("Tampilan menu: ");
            System.out.println("1. Rotate right\n" +"2. Rotate left\n" + "3. Flip horizontal\n" + "4. Flip vertical\n" + "5. Exit\n");
            pilihan = scn.nextInt();
            if (pilihan <= 0){
                System.out.println("input salah!");
            }
            if (pilihan > 5){
                System.out.println("Input salah!");
            }
            if (pilihan == 1){
                int [][] matrix2 = new int[kolom][baris];
                for (int i = 0 ; i < baris ; i++){
                    for (int j = 0 ; j < kolom; j++){
                        matrix2[j][baris-i-1] = matrix[i][j];//
                    }
                }
                matrix = matrix2;
            }
            if (pilihan == 2){
                int [][] matrix2 = new int[kolom][baris];
                for (int i = 0 ; i < baris ; i++){
                    for (int j = 0 ; j < kolom ; j++){
                        matrix2[kolom-j-1][i] = matrix[i][j];//
                    }
                }
                matrix = matrix2;
            }
            if (pilihan == 3){
                int [][] matrix2 = new int[baris][kolom];
                for (int i = 0 ; i < baris ; i ++){
                    for (int j = 0 ; j < kolom; j++){
                        matrix2[i][kolom-1-j] = matrix[i][j];
                    }
                }
                matrix = matrix2;
            }
            if (pilihan == 4){
                int [][] matrix2 = new int[baris][kolom];
                for (int i = 0 ; i < baris ; i ++){
                    for (int j = 0 ; j < kolom; j++){
                        matrix2[baris-i-1][j] = matrix[i][j];//
                    }
                }
                matrix = matrix2;
            }
            if (pilihan == 5){
                System.out.println("Thank You!");
                break;
            }

            baris = matrix.length;//
            kolom = matrix[0].length;//

            for (int i = 0 ; i< baris ; i++ ){
                for (int j = 0 ; j < kolom ; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

package com.dp.praktikum;

public class BelajarArray2D {
    public static void main(String[] args) {
        int[][] awal = {
                {1, 2, 3, 4, 6, 7, 8, 9},
                {5, 6, 7, 8, 9, 0, 1, 2},
                {1, 3, 5, 7, 9, 1, 3, 5}
        };

        int[][] akhir = new int[awal[0].length][awal.length];

        for (int i=0;i< akhir.length;i++){
            for (int j=0;j<akhir[0].length;j++)
                akhir[i][j] = awal[j][i];
        }
        soutArray(awal);
        System.out.println();
        soutArray(akhir);
    }

    private static void soutArray(int[][] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}

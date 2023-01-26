package com.dp.teori;

//import java.util.Scanner;
// BELOMMMMMMMMMMMM SELESAIIIIIIIIIIIIIIi

public class Soals3 {
    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        int[][] mat1 = {{1,2,3},{4,0,1}};
        int[][] mat2 = {{1,2},{3,1},{-1,2}};
        int[][] mat3 = new int[mat1.length][mat2[0].length];


        for(int i=0;i<mat3.length;i++){
            for(int j=0;j< mat3[0].length;j++){
                mat3[i][j]=0;
                for(int k=0;k<3;k++)
                //pake k doang , jadi i sama j nya bisa dibuat patokan soalnya kan pas
                {
                    mat3[i][j]+=mat1[i][k]*mat2[k][j];
                }//end of k loop //printing matrix element
            }//end of j loop
        }

        for (int i=0;i<mat3.length;i++) {
            for (int j = 0; j < mat3[i].length; j++)
                System.out.print(mat3[i][j] + " ");
            System.out.println();
        }
    }
}

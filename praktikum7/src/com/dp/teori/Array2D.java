package com.dp.teori;

public class Array2D {
    public static void main(String[] args) {
        int[][] myArr = new int[3][3];
        // bisa kek gini
        //String [][] myArr = new String[3][];
        //myArr [0] = new String[10];
        //jadi bisa pesen berapa angka buat tiap barisnya, jadi bisa pas
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++)
                myArr[i][j] = (int) (Math.random() * 9) + 1;
        }
        int sum = 0;
        int temp;
        for (int i = 0; i < myArr.length; i++) {
            temp = 0;
            for (int j = 0; j < myArr[i].length; j++) {
                System.out.print(myArr[i][j] + "  ");
                //total semua
                temp += myArr[i][j];
                sum = temp;
            }
            System.out.print("Total: " + temp);
            System.out.println();
        }
        System.out.print("Total kolom: ");
        for (int i = 0; i < myArr.length; i++) {
            temp = 0;
            for (int j = 0; j < myArr[i].length; j++) {
                temp += myArr[j][i];
            }
            System.out.print(temp + " ");
        }

        System.out.println();
        System.out.println("Total semua: " + sum);

        //total diagonal
        sum = 0;
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++)
                if (i == j)
                    sum += myArr[i][j];
        }
        System.out.println("Total diagonal \\: " + sum);
//total diagonal
        sum = 0;
        int n;
        /*
        if (myArr.length % 2 == 0)
            n=myArr.length/2;
        else n=myArr.length/2+1;*/
        n = myArr.length/2 + 1;
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++){
                if (i == j && i==myArr.length/2)
                    sum += myArr[i][j];
                else if (i - j == n || j - i == n)
                    sum += myArr[i][j];
            }
        }
        System.out.println("Total diagonal /: " + sum);
    }
}

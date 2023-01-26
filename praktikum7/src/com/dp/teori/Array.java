package com.dp.teori;

public class Array {
    public static void main(String[] args) {
        int n=10;
        int[] nilai = new int[n];
        int min,max;
        double total=0;
        double rate;

        for (int i=0;i<n;i++)
            nilai[i]= (int)(Math.random()*100 + 1);

        System.out.println("Array: ");
        for (int isi:nilai)
            System.out.print(isi + " ");

        System.out.println();

        System.out.println("min dan max");
        min = nilai[0];
        max = nilai[0];
        for (int i=0;i<n;i++){
                if (nilai[i] < min)
                    min = nilai[i];
                if (nilai[i] > max)
                    max = nilai[i];
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);

        System.out.println("rata rata");
        for (int isi:nilai)
            total += isi;
        rate = total/n;

        System.out.printf("%.2f\n",rate);

        System.out.println("nilai lebih dari rata rata");
        for (int isi:nilai)
            if (isi > rate)
                System.out.print(isi + " ");

        System.out.println();

        System.out.println("nilai genap");
        for (int isi:nilai)
            if (isi % 2 == 0)
                System.out.print(isi + " ");


        System.out.println();
    }
}




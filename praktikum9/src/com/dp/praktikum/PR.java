package com.dp.praktikum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PR {
    public static void main(String[] args) {
        //deklarasi
        Scanner scn = new Scanner(System.in);
        //array 2D
        List<List<Integer>> list = new ArrayList<>();
        //array1 di isi hari
        list.add(new ArrayList<>());
        //array2 di isi harga
        List<Integer> harga = new ArrayList<>();
        list.add(harga);
        //array3 di isi average
        List<Integer> average = new ArrayList<>();
        list.add(average);

        int choice,count=0,input,sum=0;

        //loop do while
        do {
            System.out.println("""
                    ===[MENU SAHAM]===
                    1. Input harga hari ini
                    2. Cetak harga dan average
                    3. Exit""");
            choice = scn.nextInt();
            if (choice==1){
                //isi array1
                list.get(0).add(++count);
                System.out.print("Masukkan harga saham hari ini: ");
                input = scn.nextInt();
                //isi array2
                harga.add(input);
                //isi array3
                sum += input;
                average.add(sum/count);
            }
            if (choice==2) {
                System.out.printf("%s %7s %8s\n","Hari","Harga","AVG");
                //print tiap data ke i di setiap array isi
                for (int i=0;i< list.get(0).size();i++){
                    System.out.printf("%d %9d %9d\n",list.get(0).get(i),list.get(1).get(i),list.get(2).get(i));
                }
            }
        } while (choice!=3);
        //kalo exit
        System.out.println("Thank you for using our service! See you next time.");
    }
}

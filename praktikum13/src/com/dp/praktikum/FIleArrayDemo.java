package com.dp.praktikum;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FIleArrayDemo {
    public static void main(String[] args) {
        ArrayList<String> namas = new ArrayList<>();
        namas.add("Jewe");
        namas.add("Grace");
        namas.add("Fei-fei");


        try {
            FileWriter fwrite = new FileWriter("data/Namas.txt", false);
            PrintWriter myPrint = new PrintWriter(fwrite);
            for (String nama : namas) {
                myPrint.println(nama);
            }
            myPrint.close(); // don't forget to close file
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        // Read file
        ArrayList<String> namanama = new ArrayList<>();

        try {
            File myFile = new File("data/Namas.txt");
            Scanner fscn = new Scanner(myFile);
            while (fscn.hasNext())
                namanama.add(fscn.nextLine());
            fscn.close();
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        for (String s : namanama) {
            System.out.println(s);
        }
    }
}

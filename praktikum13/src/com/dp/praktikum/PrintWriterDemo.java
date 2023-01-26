package com.dp.praktikum;

import java.io.*;
import java.util.Scanner;

public class PrintWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fwrite = new FileWriter("data/Names.txt", false);
            PrintWriter myPrint = new PrintWriter(fwrite);
            myPrint.println("Mayumi");
            myPrint.println("Vania");
            myPrint.println("Valen");
            myPrint.close(); // don't forget to close file
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        // Read file

        try {
            File myFile = new File("data/Names.txt");
            Scanner fscn = new Scanner(myFile);
            while (fscn.hasNext())
                System.out.println(fscn.nextLine());
            fscn.close();
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}

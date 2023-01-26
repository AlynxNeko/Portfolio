package com.dp.teori;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static com.dp.praktikum.ThrowException.printError;

public class BelajarFiles {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int pil = scn.nextInt();
        scn.nextLine();
        try {
            System.out.print("Nama file: ");
            String namaFile = scn.nextLine();
            if (pil == 1)
                inputFile(namaFile);
            else if (pil == 2)
                displayFile(namaFile);
        } catch (IOException e) {
            printError(e.getMessage());
        }
    }

    private static void displayFile(String nama) throws IOException{
        if (new File(nama).exists()) {
            File namama = new File(nama);
            Scanner sc = new Scanner(namama);
            while (sc.hasNext())
                System.out.println(sc.nextLine());
        }
    }

    public static void inputFile (String nama) throws IOException{
        if (new File(nama).exists()) {
            try {
                System.out.print("Isi text: ");
                String text = scn.nextLine();
                FileWriter fwrite = new FileWriter(nama, true);
                PrintWriter outputFile = new PrintWriter(fwrite);
                outputFile.println(text);
                outputFile.close();
            } catch (IOException e) {
                throw new IOException("File tidak dapat di isi");
            }
        }
        else throw new IOException("File not found");
    }
}

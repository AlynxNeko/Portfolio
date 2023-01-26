package com.dp.teori;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Nomer7 {
    static ArrayList<String> inputs = new ArrayList<>();
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n = scn.nextInt();
            scn.nextLine();
            for (int i = 0; i < n; i++) {
                inputs.add(scn.nextLine());
            }
            inputData();
            convertData();


        } catch (IOException e) {
            System.out.println("Terjadi kesalahan -> " + e.getMessage());
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan -> Input salah!");
        }
    }

    private static void convertData() throws IOException, IndexOutOfBoundsException {
        File file = new File("input.txt");
        Scanner fscn = new Scanner(file);

        FileWriter fwriter = new FileWriter("output.txt",false);
        PrintWriter pwriter = new PrintWriter(fwriter);

        while (fscn.hasNextLine()) {
            String[] temp = fscn.nextLine().split(",");
            int n = Integer.parseInt(temp[1]);
            String it = temp[2];
            String whatdo = temp[0].toLowerCase();
            switch (whatdo) {
                case "segitiga":
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j <= i; j++) {
                            pwriter.print(it);
                        }
                        pwriter.println();
                    }
                    break;
                case "kotak":
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            pwriter.print(it);
                        }
                        pwriter.println();
                    }
                    break;
                case "garis":
                    for (int i = 0; i < n; i++) {
                        pwriter.print(it);
                    }
                    pwriter.println();
                    break;
            }
            pwriter.println();
        }
        pwriter.close();
    }

    private static void inputData() throws IOException {
        FileWriter fwriter = new FileWriter("input.txt",false);
        PrintWriter pwriter = new PrintWriter(fwriter);
        for (String s : inputs) {
            pwriter.println(s);
        }
        pwriter.close();
    }
}

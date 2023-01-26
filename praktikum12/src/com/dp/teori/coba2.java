package com.dp.teori;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class coba2 {
    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);
        File file = new File(scn.nextLine());
        Scanner printFile = null;
        try {
            printFile = new Scanner(file);
            while (printFile.hasNext())
                System.out.println(printFile.nextLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

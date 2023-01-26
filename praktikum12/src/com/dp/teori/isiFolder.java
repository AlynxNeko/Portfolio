package com.dp.teori;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class isiFolder {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(System.in);
        File dir = new File(scn.nextLine());
        Scanner sc = new Scanner(dir);
        File[] Isisisi = dir.listFiles();
        assert Isisisi != null;
        for (File el: Isisisi) {
            if (el.isFile())
                System.out.printf("File name: %s\n", el.getName());
            else if (el.isDirectory())
                System.out.printf("Directory name: %s\n", el.getName());
        }
    }
}

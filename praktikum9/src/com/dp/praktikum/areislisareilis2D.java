package com.dp.praktikum;

import java.util.ArrayList;
import java.util.List;

public class areislisareilis2D {
    public static void main(String[] args) {
        List<List<String>> daftarNama = new ArrayList<>();
        List<String> nama = new ArrayList<>();
        daftarNama.add(nama);
        daftarNama.add(nama);
        daftarNama.get(0).add("Bejo");
        nama.add("Rezon");

        daftarNama.add(new ArrayList<>());//ditambah 1 array secara anonymous
        daftarNama.get(2).add("Khresna");

        System.out.println(daftarNama);
    }
}

package com.dp.teori;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Latihan2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //List<String> list2 = new ArrayList<>();
        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Pink");
        list.add("Purple");

        //list 2 harus sudah ada isi dulu baru bisa dijalankan
        //Collections.copy(list2,list);
        //System.out.println(list2);

        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(list.lastIndexOf("Red")+1);
    }
}

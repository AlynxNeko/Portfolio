package com.dp.teori;

import java.util.*;

public class BelajarArrayList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        List<List<String>> array = new ArrayList<>();
        array.add(list);
        array.add(list);

        while (true){
            String text = scn.next();
            if (text.equals("#"))
                break;
            list.add(text);
        }

        System.out.println(list);
        System.out.println(list.size());
        list.add(list.size()/2, "%#7&8@");
        list.set(list.size()/3, "Uvuvwevew");
        System.out.println(list);


        System.out.println(array);
    }
}

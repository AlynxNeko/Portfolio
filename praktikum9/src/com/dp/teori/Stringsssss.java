package com.dp.teori;

import java.util.ArrayList;
import java.util.List;

public class Stringsssss {
    public static void main(String[] args) {
        String text = "UK Petra Surabaya 123";
        List<String> word = new ArrayList<>();
        //per kata
        int count = text.indexOf(" ");

        for (int i=0;true;){
            word.add(text.substring(i,count));
            i = count+1;
            count = text.indexOf(" ",i);
            if (count==-1) {
                word.add(text.substring(i));
                break;
            }
        }
        System.out.println(word);
        System.out.println();
    }
}

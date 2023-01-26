package com.dp.teori;

import java.util.*;

public class Cobak {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int n = scn.nextInt();
        list.add(n);
        System.out.println(list);
        while (n!=0){
            int i=0;
            n = scn.nextInt();
            for (;i< list.size();i++){
                if (n<=list.get(i)) {
                    break;
                }
            }
            list.add(i,n);
            System.out.println(list);
        }
    }
}

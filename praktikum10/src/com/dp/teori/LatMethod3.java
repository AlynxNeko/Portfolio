package com.dp.teori;

public class LatMethod3 {
    public static void main(String[] args) {
        System.out.println(minFrom(7,5,3));
    }

    public static int minFrom(int a, int b, int c) {
        if (a<b && a<c)
            return a;
        else if (b<c)
            return b;
        return c;
    }
}

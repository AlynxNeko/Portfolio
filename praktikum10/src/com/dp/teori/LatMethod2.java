package com.dp.teori;

public class LatMethod2 {
    public static void main(String[] args) {
        int r = 7;
        System.out.println(luasO(r));
    }

    private static double luasO(int r) {
        return (Math.PI*Math.pow(r,2));
    }
}

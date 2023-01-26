package com.dp.teori;

public class LatMethod1 {
    public static void main(String[] args) {
        String kata = "Petra";
        segi3(kata);
    }

    private static void segi3(String kata) {
        for (int i=0;i<kata.length();i++){
            for (int j=0;j<=i;j++)
                System.out.print(kata.charAt(j));
            System.out.println();
        }
    }

}

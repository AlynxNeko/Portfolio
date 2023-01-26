package com.dp.teori;

public class random {
    public static void main(String[] args) {
        System.out.println("if (n == 1)\n  System.out.println(\"Ganjil\");");
        for (int i=2;i<=10000;i++)
        {
            if (i%2==0)
                System.out.printf("else if (n == %d)\n   System.out.println(\"Genap\");\n",i);
            else System.out.printf("else if (n == %d)\n  System.out.println(\"Ganjil\");\n",i);
        }
    }
}

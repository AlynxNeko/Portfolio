package com.dp.praktikum;

public class BelajarString {
    public static void main(String[] args) {
        //basic concept of String
        char[] helloArray = {'h','e','l','l','o','.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
        System.out.println(helloString.toUpperCase());
        System.out.println(helloString);//not changing (immutable)

        String x = "10";
        int y = 20;
        x = x + y;
        System.out.println(x);//output "1020" (string)
        System.out.println(x.concat("ab"));//must be string with string

        System.out.println("This is the \"String\" class");
        System.out.println("\" \\ \n \t aaa"); // \n = enter, \t = tab

        String name = "Tomi";
        int age = 20;
        String greeting = String.format("Hello, my name is %s. I'm %d years old.", name, age);//like printf
                                                                                    // but without the print
        System.out.println(greeting);

        //method2
        String str1 = "Java String Examples";
        System.out.println(str1.contains("Java"));
        System.out.println(str1.contains("java"));

        System.out.println(str1.indexOf("String"));
        System.out.println(str1.indexOf('s'));

        System.out.println(str1.substring(6,15));
        System.out.println(str1.substring(0,15));
        System.out.println(str1.substring(6));
        System.out.println(str1.charAt(14));

        String text = "Java is a fun programming language";
        String[] res = text.split(" ");
        for (String el : res)
            System.out.print(el+"-");
    }
}

package com.dp.teori;

import java.util.Scanner;

public class CobaEx2 {
    public static void main(String[] args) {
        System.out.println("--Calculator Program--");
        System.out.println("Input a/b (e.g.13/5)");
        String input = new Scanner(System.in).nextLine();
        input = input.replace(" ","");

        int slash = input.indexOf('/');
        if (slash == -1){
            System.out.println("What are you doing? \"/\" is not found");
            return;
        }
        try {
            int a = Integer.parseInt(input.substring(0,slash));
            int b = Integer.parseInt(input.substring(slash+1));

            System.out.printf("%d/%d = %d, remainder = %d\n",a,b,a/b,a%b);
        }catch (ArithmeticException e){
            System.out.println("Can't divide with zero you schewpid");
        }catch (NumberFormatException e1){
            System.out.printf("Error.. either (%s) or (%s) is not a number",
                    input.substring(0,slash), input.substring(slash+1));
        }
    }
}

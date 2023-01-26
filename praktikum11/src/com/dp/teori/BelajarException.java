package com.dp.teori;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BelajarException {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //run time exception -> misal pembagian dengan 0
        //index out of bound exception
        //null pointer exception

        /*int n= scn.nextInt(); //kalo ini 0 program ga lanjut jalan
        System.out.println(9/n);*/

        try {
            System.out.println("input angka");
            double n= scn.nextInt();
            System.out.println(9.0/n);
            System.out.println("Success");
        }catch (ArithmeticException e) {//catch (ExceptionName Error)
            System.out.println("Error code: "+e);
        }catch (InputMismatchException e1){
            System.out.println("Angka weh\n" + e1);
            scn.nextLine();
        }
        System.out.println("program masih jalan");

        int[] arr = {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        try {
            int n = scn.nextInt();
            System.out.println(arr[n]);
        }catch (IndexOutOfBoundsException e1) {
            System.out.println("Error code: " + e1);
        }
        System.out.println("program jalan");
        int a = 1000;
        int b = 12;
        try {
            System.out.println(pembagian(a,b));
        } catch (ArithmeticException e){
            System.out.println("Error: " + e);
        }catch (MyException e){
            System.out.println("Error code: " + e);
        }

    }

    //exception dalam fungsi
    private static int pembagian(int a, int b) throws MyException{
        if (b == 120) throw new ArithmeticException();//bikin error sendiri tanpa sebab
        if (a>100)
            throw new MyException("Kegedean bre, capek");
        return (a/b);
    }
}

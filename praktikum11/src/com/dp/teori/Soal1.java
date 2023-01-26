package com.dp.teori;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] array = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        while (true) {
            try {
                printArr(array);
                int x = scn.nextInt();
                inputArr(x,array,scn.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Can you input a number please");
                scn.nextLine();
            } catch (IndexOutOfBoundsException e1) {
                System.out.println("Too much, I can't handle it");
            } catch (RuntimeException e2) {
                System.out.println("1-100 yak");
            } catch (MyException e3) {
                System.out.println(e3.getMessage());
            } catch (Exception e4) {
                System.out.println("Something wrong but I don't know where");
            }
        }
    }

    private static void inputArr(int index,int[] array,int angka) throws Exception{
        if (angka<1 || angka>100) throw new RuntimeException();
        if (angka == 69) throw new MyException("Nice one but nah");
        array[index] = angka;
    }

    private static void printArr(int[] array) {
        for (int i:array)
            System.out.print(i+" ");
        System.out.println();
    }
}

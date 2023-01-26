package com.dp.teori;

import java.util.*;

public class Cobak2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> Genap = new ArrayList<>();
        List<Integer> Ganjil = new ArrayList<>();
        List<Integer> Palindrome = new ArrayList<>();
        List<Integer> Prime = new ArrayList<>();
        ArrayList<Integer> input = new ArrayList<>();
        int count = 0;
        while (true) {
            int n;
            boolean used=false;
            n= scn.nextInt();
            if (n==0)
                break;
            count++;
            for (int i=0;i<input.size()-1;i++)
                if (input.get(i) == n) {
                    used = true;
                    break;
                }
            if (used)
                continue;
            input.add(n);
        }

        for (int j=0;j<input.size();j++) {
            int n=input.get(j);
            if (n%2==0) {
                Genap.add(n);
                if (n==0)
                    break;
            }
            else
                Ganjil.add(n);

            //palindrome
            int nCopy = n;
            int temp=0;
            while (nCopy>0){
                temp = temp*10 + nCopy%10;
                nCopy/=10;
            }
            if (temp==n)
                Palindrome.add(n);

            //prime
            temp = 0;
            for (int i=2;i<n;i++)
                if (n%i==0)
                    temp++;
            if (temp == 0)
                Prime.add(n);
        }
        Collections.sort(Ganjil);
        Collections.sort(Genap);
        Collections.sort(Palindrome);
        Collections.sort(Prime);
        System.out.println("Ganjil: "+Ganjil);
        System.out.println("Genap: "+Genap);
        System.out.println("Palindrom: "+Palindrome);
        System.out.println("Prima: "+Prime);
        System.out.println("Array: "+input);
        System.out.println("Array size: "+input.size());
        System.out.println("Array original size: "+count);
    }
}

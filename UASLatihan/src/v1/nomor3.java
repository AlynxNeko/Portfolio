package v1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        String c = "y";
        while (c.equalsIgnoreCase("y")){
            try {
                System.out.print("Input nama : ");
                String name = scn.nextLine();
                System.out.print("Input nilai : ");
                double grade = scn.nextDouble();
                scn.nextLine();
                names.add(name);
                grades.add(grade);
                do {
                    System.out.print("Input lagi? ");
                    c = Character.toString(scn.nextLine().charAt(0));
                } while (!c.equalsIgnoreCase("y") && !c.equalsIgnoreCase("n"));
            } catch (InputMismatchException e) {
                System.out.println("Data harus berupa numerik");
                scn.nextLine();
            }
        }
        System.out.println("Data Nama: " + names);
        System.out.println("Data Nilai: " + grades);

        c = "y";
        while (c.equalsIgnoreCase("y")){
            String find = scn.nextLine();
            if (!names.contains(find))
                System.out.println("Data siswa tidak ditemukan");
            else
                for (int i = 0; i < names.size(); i++) {
                    if (find.equals(names.get(i)))
                        System.out.println("Nilai dari " + find + " = " + grades.get(i));
                }
            do {
                System.out.print("Ada lagi yang dicari? ");
                c = Character.toString(scn.nextLine().charAt(0));
            } while (!c.equalsIgnoreCase("y") && !c.equalsIgnoreCase("n"));
        }
    }
}

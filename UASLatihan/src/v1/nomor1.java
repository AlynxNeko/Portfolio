package v1;

import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukan nama pengarang dengan 3 kata: ");
        String fullName = scn.nextLine();
        System.out.println("Masukan judul buku: ");
        String bookName = scn.nextLine().trim();
        System.out.println("Masukan tanggal terbit (2 digit): ");
        int date = scn.nextInt();
        System.out.println("Masukan bulan terbit (2 digit): ");
        int month = scn.nextInt();
        System.out.println("Masukan tahun terbit (4 digit): ");
        int year = scn.nextInt();
        String initial = (fullName.charAt(0)
                + Character.toString(fullName.charAt(fullName.indexOf(" ")+1))
                + fullName.charAt(fullName.lastIndexOf(" ") + 1)).toUpperCase();

        fullName = Character.toString(fullName.charAt(fullName.lastIndexOf(" ")+1)).toUpperCase()
                + fullName.substring(fullName.lastIndexOf(" ")+2).toLowerCase() + ", "
                + Character.toString(fullName.charAt(0)).toUpperCase()
                + fullName.substring(1,fullName.indexOf(" ")+1).toLowerCase()
                + Character.toString(fullName.charAt(fullName.indexOf(" ")+1)).toUpperCase() + "";
        String result = fullName + " [" + initial + "], " + bookName + ": " + date + "-" + month + "-" + year%100 + "";
        System.out.println(result);
        System.out.println(result.replaceAll(" ","_"));
        System.out.println("Panjang Referensi = " + result.length());

    }
}

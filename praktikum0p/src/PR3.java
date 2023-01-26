import java.util.Scanner;

//Buatlah program yang menerima input berupa 2 angka dan input tersebut akan menentukan ukuran sebuah silinder:
//- Angka yang kecil akan menjadi radius alas silinder
//- Angka yang besar akan menjadi tinggi silinder
//
//Setelah itu tampilkan menu input pilihan dengan menggunakan SWITCH
//Pilihan 1: Hitung volume silinder (lalu exit)
//Pilihan 2: Hitung luas permukaan silinder (lalu exit)
//Pilihan 3: Exit program
//
//Gunakan Math.PI dan Math.Pow() untuk menghitungnya
//
//Contoh:
//Input A: 3
//Input B: 6
//
//Output:
//Menu:
//1. Hitung volume
//2. Hitung luas
//3. Exit
//Masukkan pilihan: 1
//
//Volume silinder adalah: 169.65
//
//
//Contoh 2:
//Input A: 3
//Input B: 6
//
//Output:
//Menu:
//1. Hitung volume
//2. Hitung luas
//3. Exit
//Masukkan pilihan: 3
//
//Terima kasih!
public class PR3 {
    public static void main(String[] args) {
        //Scanner
        Scanner scn = new Scanner(System.in);

        //deklarasi
        double n1;
        double n2;
        int pilihan;
        double volume;
        double luas;


        //input
        System.out.print("Input 1: ");
        n1 = scn.nextInt();
        System.out.print("Input 2: ");
        n2 = scn.nextInt();

        //eksekusi
        if (n2 < n1) {
            double temp = n1;
            n1 = n2;
            n2 = temp;
        }

        //input pilihan
        System.out.print("Menu:\n" +
                "1. Hitung volume\n" +
                "2. Hitung luas\n" +
                "3. Exit\n" +
                "Masukkan pilihan: ");
        pilihan = scn.nextInt();

        //eksekusi
        volume = (Math.PI * Math.pow(n1, 2) * n2);
        luas = (2 * Math.PI * Math.pow(n1, 2) + Math.PI * n1 * 2 * n2);
        //output
        switch (pilihan){
            case 1:
                System.out.println("Volume = " + Math.round(volume*100)/100.0);
                break;
            case 2:
                System.out.println("Luas Permukaan = " + Math.round(luas*100)/100.0);
                break;
            case 3:
                System.out.println("Terima Kasih! ");
                break;
            default:
                System.out.println("...");
        }
    }
}

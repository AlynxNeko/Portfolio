package v1;

import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Penjumlahan dan Pengurangan 2 bilangan Kompleks");
        System.out.print("Real part 1 = ");
        double x1 = scn.nextDouble();
        System.out.print("Imag part 1 = ");
        double y1 = scn.nextDouble();
        System.out.print("Real part 2 = ");
        double x2 = scn.nextDouble();
        System.out.print("Imag part 2 = ");
        double y2 = scn.nextDouble();
        double[] plus = plusComplex(x1, y1, x2, y2);
        System.out.println("Hasil jumlahnya adalah: " + plus[0] + " + " + plus[1] + "i");
        double[] take = takeComplex(x1, y1, x2, y2);
        System.out.println("Hasil kurangnya adalah: " + take[0] + " + " + take[1] + "i");

    }

    public static double[] plusComplex(double x1, double y1, double x2, double y2) {
        return new double[]{x1 + x2, y1 + y2};
    }

    public static double[] takeComplex(double x1, double y1, double x2, double y2) {
        return new double[]{x1 - x2, y1 - y2};
    }
}

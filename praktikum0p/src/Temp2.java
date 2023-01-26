import java.util.Scanner;

public class Temp2 {
    public static void main(String[] args) {
        Scanner hehe = new Scanner(System.in); //Deklarasi objek scanner

        //Deklarasi variabel
        int pilihanUtama, pilihanPesanan;
        int jumlahPesan;
        int totalPendapatan = 0, hargaPerMenu = 0, hargaBeli = 0, jumlahPelanggan = 0;
        double ratarataPendapatan;

        do {
            //Menu utama
            System.out.println("Menu utama");
            System.out.println("1. Input penjualan");
            System.out.println("2. Akhiri berjualan");
            System.out.print("Masukkan pilihan ");
            pilihanUtama = hehe.nextInt();
            System.out.println();
            if (pilihanUtama < 1 || pilihanUtama > 2) {//Flag kalau salah pilihan
                    System.out.println("Pilihan tidak ada dalam menu");
                    System.out.println();

            } else if (pilihanUtama == 1) {//Kalau pilih nomer 1
                do { //Pakai while do, karena harus dicetak minimal 1 kali
                    //Input menu pesanan
                    System.out.println("Menu pesanan");
                    System.out.println("1. Nasi goreng biasa");
                    System.out.println("2. Nasi goreng spesial");
                    System.out.println("3. Nasi goreng jumbo");
                    System.out.println("4. Selesai");
                    System.out.print("Masukkan pilihan ");
                    pilihanPesanan = hehe.nextInt();
                    //Harga menu
                    if (pilihanPesanan < 1 || pilihanPesanan > 4) {
                            System.out.println("Pilihan tidak ada dalam menu");
                            System.out.println();
                    }
                    else if (pilihanPesanan == 4) { //Pintu keluar
                        System.out.println("Total yang harus dibayar " + hargaBeli);
                        System.out.println();
                        jumlahPelanggan++;
                        totalPendapatan += hargaBeli; //Total pendapatan dari harga beli berturut-turut
                        hargaBeli = 0; //Dinolkan lagi, supaya gak ketumpuk sama pembayaran pembeli sebelumnya
                        hargaPerMenu = 0; //Dinolkan lagi, supaya gak ketumpuk sama pembayaran pembeli sebelumnya
                    } else {
                        //Input jumlah menu yang dipesan
                        do {
                            System.out.print("Masukkan jumlah ");
                            jumlahPesan = hehe.nextInt();
                            System.out.println();
                            hargaPerMenu = 10000;
                            if (jumlahPesan < 0) {
                                    System.out.println("Jumlah pesanan tidak valid");
                                    System.out.println();
                            } else {
                                if (pilihanPesanan == 1) { //Untuk pilihan pertama
                                    hargaPerMenu = hargaPerMenu * jumlahPesan;
                                } else if (pilihanPesanan == 2) { //Untuk pilihan kedua
                                    hargaPerMenu = (hargaPerMenu + 3000) * jumlahPesan;
                                } else { //Untuk pilihan ketiga
                                    hargaPerMenu = (hargaPerMenu + 5000) * jumlahPesan;
                                }
                            }
                        } while (jumlahPesan < 0);
                    }
                    hargaBeli += hargaPerMenu; //Supaya total pembayarannya pake menu sebelumnya juga
                } while (pilihanPesanan != 4); //Looping kalau pilih 1-3
            }
        } while (pilihanUtama != 2); //Looping kalau gak milih 2, kalau milih 2 loopingnya berhenti

        //Ouput kalau penjualan sudah selesai
        System.out.println("Total pendapatan hari ini Rp" + totalPendapatan);
        System.out.println("Jumlah pelanggan " + jumlahPelanggan + " orang");
        ratarataPendapatan = totalPendapatan / jumlahPelanggan;
        System.out.println("Rata-rata pendapatan per pelanggan Rp" + ratarataPendapatan);
    }
}


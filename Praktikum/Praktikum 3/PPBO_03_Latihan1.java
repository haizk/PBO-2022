// Nama : Hezkiel Bram Setiawan
// NIM  : M0521030

import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total pembelian : ");
        
        // tambahkan code untuk menyimpan nominal total pembelian
        double total = sc.nextDouble();
        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        int diskon = (total > 125000 ? 80 : (total > 75000 ? 85 : (total >= 50000 ? 95 : 100)));
        
        // tambahkan code untuk menampilkan nominal yang harus dibayar sesuai dengan ketentuan diskon yang diberikan
        System.out.println("Anda mendapatkan " + (100-diskon) + " persen diskon!\nNominal yang harus dibayar: " + total * diskon / 100);

        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000
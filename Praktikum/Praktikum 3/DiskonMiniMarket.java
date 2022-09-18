import java.util.Scanner;

public class DiskonMiniMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
        // tambahkan code untuk menyimpan nominal total pembelian
        double total = sc.nextDouble();
        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        int diskon = (total > 125000 ? 80 : (total > 75000 ? 85 : (total >= 50000 ? 95 : 100)));

        // tambahkan code untuk menampilkan nominal yang harus dibayar sesuai dengan ketentuan diskon yang diberikan
        System.out.println("Anda mendapatkan " + (100-diskon) + " persen diskon!\nNominal yang harus dibayar: " + total * diskon / 100);

        sc.close();
    }
}
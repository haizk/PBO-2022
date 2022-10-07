// Nama : Hezkiel Bram Setiawan 
// NIM  : M0521030

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                // Ganti dengan tipe data int karena pembagian dengan 0 menggunakan tipe data double pada Java tidak menimbulkan exception.
                // double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
                int hasil = bil1 / bil2;

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch(InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            } catch(ArithmeticException e) { // Tambahkan catch statement tambahan di sini
                System.out.println("Penyebut tidak boleh bernilai 0");
            }
        }

        sc.close();
    }
}

// Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Tambahkan catch statement
// tambahan untuk menangani pembagian dengan 0 pada source code tersebut!
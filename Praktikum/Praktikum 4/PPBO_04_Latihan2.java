// Nama : Hezkiel Bram Setiawan
// NIM  : M0521030

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan2 {
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
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
        }

        sc.close();
    }
}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!
/*  Jawab: 
    Pada source code ini terdapat try-catch block yang berfungsi untuk meng-handle exception yang mungkin terjadi.
    Apabila terjadi exception, code di bawah penyebab exception tidak tereksekusi dan langsung lompat ke block catch.
    Lalu, code pada block catch akan tereksekusi.

    Perbedaannya dengan source code sebelumnya (Latihan1) adalah tidak terdapat sesuatu yang meng-handle exception pada source code sebelumnya.
    Ketika terjadi exception, program langsung berhenti dan tercetak penyebab exception.
*/
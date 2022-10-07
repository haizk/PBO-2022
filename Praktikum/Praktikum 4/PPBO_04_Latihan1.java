// Nama : Hezkiel Bram Setiawan
// NIM  : M0521030

import java.util.Scanner;

public class PPBO_04_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        sc.close();
    }
}

/* a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
 - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB :
    Program TIDAK dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama.

    Output yang muncul adalah:
        Ketik bilangan pertama : f
        Exception in thread "main" java.util.InputMismatchException
            at java.util.Scanner.throwFor(Unknown Source)      
            at java.util.Scanner.next(Unknown Source)
            at java.util.Scanner.nextInt(Unknown Source)       
            at java.util.Scanner.nextInt(Unknown Source)       
            at PPBO_04_Latihan1.main(PPBO_04_Latihan1.java:10) 

    Terjadi input mismatch exception karena input yang dimasukkan berbeda dengan tipe data yang diminta.
*/

/* b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. 
    Jelaskan output yang muncul!
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB :
    Output yang muncul:
        Ketik bilangan pertama : 69420
        Ketik bilangan kedua : 0
        69420 / 0 = Infinity
    
    Hasil dari pembagian tipe data Double dengan 0 adalah Infinity berdasarkan IEEE-754 standard, sebagai mana Java menganut standard tersebut untuk menghitung floating point.
    Apabila yang dibagi adalah tipe data Integer, akan menghasilkan div by zero exception karena tipe data Integer tidak tercover dalam IEEE-754 standard.
*/
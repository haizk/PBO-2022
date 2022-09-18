// Nama : Hezkiel Bram Setiawan
// NIM  : M0521030

import java.util.Scanner;

public class PPBO_03_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        // tuliskan kodemu di sini
        /*
            leap year sepengetahuan saya:
            - apabila kelipatan 100, harus habis dibagi 400
            - habis dibagi 4
            - untuk masa Anno Domini (AD) dimulai pada tahun ke-8

            berikut adalah pengecek leap year untuk masa Anno Domini
        */

        /* MORE READABLE CODE
        if(year % 100 == 0 && year % 400 == 0 && year >= 8)
            System.out.println(year + " is a leap year");
        else if(year % 100 == 0 && year >= 8)
            System.out.println(year + " is not a leap year");
        else if(year % 4 == 0 && year >= 8)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
        */

        System.out.println(year + ((year % 100 == 0 && year % 400 == 0 && year >= 8) ? " is a leap year" : ((year % 100 == 0 && year >= 8) ? " is not a leap year" : ((year % 4 == 0 && year >= 8) ? " is a leap year" : " is not a leap year"))));

        sc.close();
    }
}

// Buatlah conditional statement untuk melakukan pengecekan terhadap input variabel 'year'
// Cek apakah input merupakan tahun kabisat
// Jika tahun kabisat, berikat output '... is a leap year'
// Jika bukan tahun kabisat, berikan output '... is not a leap year'
// ... di atas maksudnya adalah nilai variabel 'year' yang diinputkan

// Contoh 
// input : 2020
// output : 2020 is a leap year

// Contoh
// input : 2031
// output : 2031 is not a leap year
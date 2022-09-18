// Nama : Hezkiel Bram Setiawan
// NIM  : M0521030 

public class PPBO_03_Latihan3 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        // for (int i = 1; i < 6; i++) {
        //     System.out.println("elemen ke-" + i + " = " + arr[i]);
        // }
        
        // PERBAIKAN
        for(int i = 0; i < 5; i++)
            System.out.println("elemen ke-" + (i+1) + " = " + arr[i]);
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

/* Jawab:
   Penulisan kode perulangan dengan for pada code tersebut belum tepat

   Java memulai index dari 0
   sehingga angka 5 pada index ke-0 tidak tercetak
   dan ketika ingin mencetak index ke-5 akan menimbulkan error
   karena melebihi jumlah index yang dimiliki array

   Untuk memperbaiki kode, variabel i dimulai dari 0 sampai 4
   
   Apabila memang ingin menuliskan index ke-0 merupakan elemen ke-1
   maka pada System.out.println variabel i ditambah 1
   menjadi (i+1)
   *diberi tanda kurung agar tidak salah dimengerti oleh program
*/
// Nama : Hezkiel Bram Setiawan
// NIM : M0521030

package com.java.p8a;

// Saya tambahkan import agar bisa mengakses public class Buku.
// Apabila tidak, akan terjadi 'cannot resolve' untuk semua yang berasal dari class Buku, termasuk class Buku itu sendiri.
// Tanpa import, package com.java.p8 dan com.java.p8a merupakan 'world' yang berbeda sehingga tidak bisa mengaksesnya.
import com.java.p8.Buku;

public class ClassX {
    public static void main(String[] args) {
        // buat objek buku
        Buku buku = new Buku("432A326B4", "Pengenalan Komputasi Cloud", "Eri Suhardi", "Elex Media Komputindo", 2022);

        // tampilkan data buku lewat method printDataBuku
        buku.printDataBuku();

        // akses ke variabel yang ada di objek buku
        System.out.println(buku.isbn);
        System.out.println(buku.judul);
        System.out.println(buku.penulis);
        System.out.println(buku.penerbit);
        System.out.println(buku.tahunTerbit);
    }
}

/*
    Adakah error yang ditemui pada ClassX yang berkaitan dengan access modifier? Jelaskan penyebab errornya!
        Terdapat problem pada buku.printDataBuku() dan buku.penerbit karena method printDataBuku() dan variabel penerbit pada class Buku memiliki access modifier protected.
        Access modifier protected artinya hanya dapat diakses dari dalam class tersebut dan subclass dari class tersebut.
        ('printDataBuku' has protected access in 'com.java.p8.Buku')
        ('penerbit' has protected access in 'com.java.p8.Buku')

        Terdapat problem pada buku.isbn dan buku.tahunTerbit karena variabel isbn dan tahunTerbit pada class Buku memiliki access modifier default.
        Access modifier default artinya tidak bisa diakses di luar package.
        ('isbn' is not public in 'com.java.p8.Buku'. Cannot be accessed from outside package)
        ('tahunTerbit' is not public in 'com.java.p8.Buku'. Cannot be accessed from outside package)

        Terdapat problem pada buku.penulis karena variabel penulis pada class Buku memiliki access modifier private.
        Access modifier private artinya hanya dapat diakses dari dalam class tersebut.
        ('penulis' has private access in 'com.java.p8.Buku')

        Sedangkan class ini berada di luar package dan bukan subclass dari class Buku.
 */
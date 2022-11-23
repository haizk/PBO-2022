// Nama : Hezkiel Bram Setiawan
// NIM : M0521030

package com.java.p8;

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
        Terdapat problem pada buku.penulis karena variabel penulis pada class Buku memiliki access modifier private.
        Access modifier private artinya hanya dapat diakses dari dalam class tersebut.
        ('penulis' has private access in 'com.java.p8.Buku')

        Sedangkan class ini berada di luar class Buku tetapi masih di package yang sama.
 */
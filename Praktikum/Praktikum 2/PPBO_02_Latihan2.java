// Nama : Hezkiel Bram Setiawan
// NIM  : M0521030
public class PPBO_02_Latihan2 {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        KURS_DOLLAR = 13500;
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}
// Apa yang salah dengan source code tersebut?
// Jawaban : Pada line 8 ingin mengubah nilai dari variabel final/konstanta.
// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
// Jawaban : Keyword static digunakan agar pada sebuah class hanya terdapat 1 copy dari variabel tersebut tidak peduli berapa banyak objek yang dibuat.
//           1 copy tersebut akan bernilai sama walaupun diakses dari objek berbeda dalam class yang sama.
//           Variabel tersebut juga bisa diakses langsung menggunakan nama classnya, contoh: Mahasiswa.NIM; dengan syarat NIM static dan tidak private.
//           Hal ini juga bisa menghemat alokasi memori.
//           Apabila tidak dideklarasikan menggunakan keyword static, variabel tersebut akan menjadi banyak copy bergantung pada banyak objek.
//           Jadi tiap objek memiliki nilai variabel berbeda-beda dan menggunakan memori yang lebih banyak.
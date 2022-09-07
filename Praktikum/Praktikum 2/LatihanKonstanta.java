public class LatihanKonstanta {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        //KURS_DOLLAR = 13500; <- terjadi error karena ingin mengubah nilai dari variabel final/konstanta
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}

/* Apa yang salah dengan source code tersebut?
 *>> Pada line 6 ingin mengubah nilai dari variabel final/konstanta.
 *
 * Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
 *>> Keyword static digunakan agar pada sebuah class hanya terdapat 1 copy sehingga menghemat alokasi memori.
 *>> Apabila tidak dideklarasikan menggunakan keyword static, variabel tersebut akan menjadi banyak copy bergantung pada banyak objek.
 *>> Jadi tiap objek memiliki nilai variabel berbeda-beda dan menggunakan memori yang lebih banyak.
 */
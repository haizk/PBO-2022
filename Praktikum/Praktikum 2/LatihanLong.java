public class LatihanLong {
    public static void main(String[] args) {
        // long p = 2147483648; <- terjadi error karena dianggap sebagai int dan melebihi range dari int
        long p = 2147483648L; // <- perbaikan
        System.out.println(p);
    }
}

/* Apa maksud dari pesan error yang muncul?
 *>> "The literal 2147483648 of type int is out of range"
 *>> Angka 2147483648 dianggap sebagai tipe data int dan melebihi range dari int sehingga muncul error tersebut.
 *
 * Bagaimana memperbaiki source code tersebut?
 *>> Dengan cara menambahkan L pada akhir angka 2147483648 sehingga bisa dianggap sebagai tipe data long dan tidak menimbulkan error.
 */
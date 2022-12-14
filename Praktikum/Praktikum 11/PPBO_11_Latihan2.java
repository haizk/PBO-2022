//  Nama    : Hezkiel Bram Setiawan
//  NIM     : M0521030

class Car extends Thread{
    String name;

    public Car(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " starts moving");

        try {
            Thread.sleep(3000);
            System.out.println(this.name+" reaches finish line");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class PPBO_11_Latihan2 {
    public static void main(String[] args) {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");

        car1.start();
        car2.start();
    }
}

/*
 * Jawablah pertanyaan berikut
 * 1.   Jalankan source code ini sebanyak 10x, hitung berapa kali car1 dan car2
 *      sampai ke garis finish pertama kali (dilihat dari output terminal)!
 *      Jawab: car1 sebanyak 6x sedangkan car2 sebanyak 4x.
 *
 *
 * 2.   Mengapa setiap run, program bisa menghasilkan output yang berbeda padahal kode diimplementasi secara adil (setiap car "bergerak"
 *      selama 3 detik) dan kode tidak ada yg diubah? Jelaskan!
 *      Jawab: Sifat dari multithreading pada Java tidak bisa diprediksi.
 *             Tidak bisa dijamin bahwa thread akan langsung berjalan setelah dijalankan.
 *
 *
 * 3.   Anggap source code akan dimodifikasi menjadi:
 *      print "{car} reaches finish line" (pada line 22) hanya dilakukan sekali dan hanya untuk car pertama yang mencapai garis finish
 *      Tanpa melakukan coding, berikan idemu supaya modifikasi di atas dapat dilakukan!
 *      Jawab: Dengan menggunakan static boolean variable.
 *             Set menjadi true apabila sudah ada yang mencapai garis finish.
 *             Gunakan if-else dengan parameter variable tadi untuk menentukan apakah mencetak atau tidak.
 *             Namun, metode ini tetap bisa mencetak kedua car mencapai garis finish karena bisa saja benar-benar bersamaan.
 *
 */
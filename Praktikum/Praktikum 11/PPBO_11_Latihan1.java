//  Nama    : Hezkiel Bram Setiawan
//  NIM     : M0521030

class MyThread extends Thread {
    int length;
    String marker;

    public MyThread(int length, String marker){
        this.length = length;
        this.marker = marker;

        var mainThread = Thread.currentThread().getName();
        System.out.println(this.getName() + " is created on " + mainThread);
    }

    @Override
    public void run(){
        int count = 0;
        while(count < length){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
            var progressString = getProgress(count, marker);
            System.out.println(this.getName() + ": " + progressString);
        }
    }

    private String getProgress(int count, String marker){
        var result = "";
        for(int i=0; i<count; i++){
            result+=marker;
        }

        return result;
    }
}

public class PPBO_11_Latihan1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello from thread '" + Thread.currentThread().getName() + "'\n");

        var thread1 = new MyThread(10, "#");
        var thread2 = new MyThread(5, ">");

        thread1.start();

        Thread.sleep(1500);

        thread2.start();
    }
}

/*
 * Jawablah pertanyaan berikut
 * 1. Jelaskan mengapa program di atas tidak bisa dijalankan (memiliki error/exception)
 *    Jawab : Program di atas terdapat fungsi blocking call, yaitu Thread.sleep(). Untuk menggunakan fungsi ini, diperlukan InterruptedException.
 *            InterruptedException akan terjadi apabila suatu thread sedang dalam blocking call, lalu terjadi interupsi.
 *
 *
 * 2. Jelaskan dan terapkan bagaimana cara mengatasinya. Kemudian, kumpulkan program dalam keadaan sudah bisa dijalankan
 *    Jawab : Cara mengatasinya adalah dengan menambahkan try catch untuk mengatasi InterruptedException
 *            atau menggunakan throws InterruptedException pada fungsi yang terdapat blocking calls.
 *
 *
 * 3. Jelaskan secara singkat algoritma program di atas
 *    Jawab : Membuat 2 thread, yaitu thread1 dan thread2.
 *            thread1 akan menampilkan # sebanyak i pada iterasi ke-i, dari i=1 hingga 5.
 *            setiap iterasi dijeda selama 1 detik.
 *            thread2 akan menampilkan > sebanyak i pada iterasi ke-i, dari i=1 hingga 10.
 *            setiap iterasi dijeda selama 1 detik.
 *            thread2 baru dimulai setelah 1.5 detik thread1 dijalankan.
 *
 */
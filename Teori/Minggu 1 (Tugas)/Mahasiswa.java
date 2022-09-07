import java.util.Scanner;

public class Mahasiswa {
    String nim, nama, jenisKelamin, alamat;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println("PENGISIAN DATA MAHASISWA");

        System.out.print("Masukkan NIM anda: ");
        String inputNIM = input.nextLine();
        
        System.out.print("Masukkan nama anda: ");
        String inputNama  = input.nextLine();
        
        System.out.print("Masukkan jenis kelamin anda: ");
        String inputJenisKelamin = input.nextLine();
        
        System.out.print("Masukkan alamat anda: ");
        String inputAlamat = input.nextLine();
        input.close();

        mahasiswa.isiData(inputNIM, inputNama, inputJenisKelamin, inputAlamat);
        mahasiswa.printData();
    }

    void isiData(String nim, String nama, String jenisKelamin, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    void printData() {
        System.out.println("\nHASIL DATA MAHASISWA");
        System.out.println("NIM\t\t"+this.nim);
        System.out.println("Nama\t\t"+this.nama);
        System.out.println("Jenis Kelamin\t"+this.jenisKelamin);
        System.out.println("Alamat\t\t"+this.alamat);
    }
}
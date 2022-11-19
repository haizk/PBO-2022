// Nama : Hezkiel Bram Setiawan
// NIM  : M0521030

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PPBO_07_Tugas1 {
	// method ini untuk input teks oleh user melalui keyboard
	public String ketikTeks() {
		System.out.println("Ketik kalimat yang akan disimpan :");
		Scanner sc = new Scanner(System.in);
		// ambil 1 kalimat, setelah tekan enter teks akan diambil
		String str1 = sc.nextLine();
        sc.close();
		return str1;
	}

	// untuk menyimpan teks yang diketik user ke file
	public void simpanTeks(String teks) {
		// set up file and stream
		// ganti path "/tmp/sample3.data" dengan alamat file di komputer anda
		File outFile = new File("Praktikum/Praktikum 7/sample3.data");
		FileOutputStream outFileStream;
		try {
			outFileStream = new FileOutputStream(outFile);
			PrintWriter outStream = new PrintWriter(outFileStream);
			outStream.print(teks);
			outStream.close();
			System.out.println("file berhasil disimpan");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PPBO_07_Tugas1 it = new PPBO_07_Tugas1();
		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();
		// memanggil method simpanTeks
		it.simpanTeks(kalimat);
	}
}

/*
    Jalankan source code tersebut, buka file teks menggunakan text editor, jelaskan seperti apa hasilnya.
		Ada 3 kasus kejadian yang bisa terjadi.
		1. Apabila file belum ada.
			Akan membuat file, lalu diisi dengan input user.
			Apabila input user mempunyai karakter Unicode, karakter tersebut akan digantikan dengan "?".
		2. Apabila file sudah ada.
			Akan menimpa (overwrite) isi dari file sebelumnya dengan input user.
			Apabila input user mempunyai karakter Unicode, karakter tersebut akan digantikan dengan "?".
		3. Apabila file yang sudah ada diatur menjadi read-only atau hidden
			Akan terjadi exception FileNotFoundException (Access is denied).
 */
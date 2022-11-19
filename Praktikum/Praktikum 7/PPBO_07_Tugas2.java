// Nama : Hezkiel Bram Setiawan
// NIM  : M0521030

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.util.Scanner;

public class PPBO_07_Tugas2 {
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
		File outFile = new File("Praktikum/Praktikum 7/sample4.data");
		FileOutputStream outFileStream;
		try {
			outFileStream = new FileOutputStream(outFile);
			DataOutputStream outStream = new DataOutputStream(outFileStream);
			outStream.writeBytes(teks);
			outStream.close();
			System.out.println("file berhasil disimpan");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PPBO_07_Tugas2 it = new PPBO_07_Tugas2();
		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();
		// memanggil method simpanTeks
		it.simpanTeks(kalimat);
	}
}

/*
    Jelaskan perbedaan cara kerja dari PrintWriter.write() dan DataOutputStream.writeBytes()
        PrintWriter.write()
            Langsung mencetak string secara keseluruhan ke file.
        DataOutputStream.writeBytes()
            Mencetak karakter satu per satu dalam bytes ke file.
 */
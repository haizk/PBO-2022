import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<KaryawanTetap> karyawanT = new ArrayList<>();
        List<KaryawanKontrak> karyawanK = new ArrayList<>();
        karyawanT.add(new KaryawanTetap(101, "Hezkiel", "Pekalongan", 3000000, 200000, 6000000));
        karyawanT.add(new KaryawanTetap(102, "Bram", "Sorogenen", 3000000, 200000, 6000000));
        karyawanT.add(new KaryawanTetap(103, "Setiawan", "Lodji", 3000000, 200000, 6000000));
        karyawanK.add(new KaryawanKontrak(201, "Ahmad", "Batang", 200000, 20));
        karyawanK.add(new KaryawanKontrak(202, "Dani", "Kauman", 200000, 24));
        karyawanK.add(new KaryawanKontrak(203, "Echa", "Pasekaran", 200000, 26));
        karyawanK.add(new KaryawanKontrak(204, "Soemantri", "Kalisalak", 200000, 20));
        karyawanK.add(new KaryawanKontrak(205, "Vadrum", "Kalipucang", 200000, 22));

        try {
            while (true) {
                System.out.print("""
                        Perusahaan Mencari Nilai A Sejati
                        1. Nama Karyawan
                        2. Alamat Karyawan
                        3. Gaji Karyawan
                        4. List Lengkap
                        0. Exit
                        Input:\040""");
                int input = scanner.nextInt();
                switch (input) {
                    case 1 -> {
                        System.out.println("\nLIST KARYAWAN\nKaryawan Tetap\nID\tNama");
                        for (var karyawan : karyawanT)
                            System.out.println(karyawan.getId() + "\t" + karyawan.getNama());
                        System.out.println("Karyawan Kontrak\nID\tNama");
                        for (var karyawan : karyawanK)
                            System.out.println(karyawan.getId() + "\t" + karyawan.getNama());
                    }
                    case 2 -> {
                        System.out.println("\nALAMAT KARYAWAN\nKaryawan Tetap\nID\tAlamat");
                        for (var karyawan : karyawanT)
                            System.out.println(karyawan.getId() + "\t" + karyawan.getAlamat());
                        System.out.println("Karyawan Kontrak\nID\tAlamat");
                        for (var karyawan : karyawanK)
                            System.out.println(karyawan.getId() + "\t" + karyawan.getAlamat());
                    }
                    case 3 -> {
                        System.out.println("\nGAJI KARYAWAN\nKaryawan Tetap\nID\tGaji");
                        for (var karyawan : karyawanT)
                            System.out.println(karyawan.getId() + "\tRp" + karyawan.hitungGaji());
                        System.out.println("Karyawan Kontrak\nID\tGaji");
                        for (var karyawan : karyawanK)
                            System.out.println(karyawan.getId() + "\tRp" + karyawan.hitungGaji());
                    }
                    case 4 -> {
                        System.out.println("\nKARYAWAN\nKaryawan Tetap");
                        for (var karyawan : karyawanT)
                            System.out.println(karyawan.getId() + " " + karyawan.getNama() + " " + karyawan.getAlamat() + " Rp" + karyawan.hitungGaji());
                        System.out.println("Karyawan Kontrak");
                        for (var karyawan : karyawanK)
                            System.out.println(karyawan.getId() + " " + karyawan.getNama() + " " + karyawan.getAlamat() + " Rp" + karyawan.hitungGaji());
                    }
                }
                if (input < 0 || input > 4)
                    System.out.println("INPUT TIDAK BISA DITERIMA!");
                else if (input == 0)
                    break;
                scanner.nextLine();
                scanner.nextLine();
            }
        } catch (Exception e) {
            System.out.println("BYE!");
        }
        scanner.close();
    }
}
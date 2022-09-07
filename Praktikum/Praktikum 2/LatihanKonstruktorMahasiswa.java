public class LatihanKonstruktorMahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;
    // buatlah constructor untuk menginisiasi nilai dari variabel
    // nim, nama, jenisKelamin, alamat
    public LatihanKonstruktorMahasiswa(String nim, String nama, char jenisKelamin, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat; 
    }
    public static void main(String[] args) {
        LatihanKonstruktorMahasiswa mhs = new LatihanKonstruktorMahasiswa("M0501001", "Patrick Star", 'L', "Bikini Bottom");
        System.out.println(mhs.nim + " " + mhs.nama + " " + mhs.jenisKelamin + " " + mhs.alamat);
    }
}
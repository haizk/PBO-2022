public class KaryawanKontrak extends Karyawan{
    private float gajiHarian;
    private int jumlahHariMasuk;

    public KaryawanKontrak(int id, String nama, String alamat, float gajiHarian, int jumlahHariMasuk) {
        super(id, nama, alamat);
        this.gajiHarian = gajiHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public float getGajiHarian() {
        return gajiHarian;
    }

    public void setGajiHarian(float gajiHarian) {
        this.gajiHarian = gajiHarian;
    }

    public int getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }

    public void setJumlahHariMasuk(int jumlahHariMasuk) {
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    @Override
    public float hitungGaji() {
        return this.gajiHarian * this.jumlahHariMasuk;
    }
}
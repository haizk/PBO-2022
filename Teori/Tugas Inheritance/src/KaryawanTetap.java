public class KaryawanTetap extends Karyawan{
    private float gajiPokok, uangMakan, tunjangan;

    public KaryawanTetap(int id, String nama, String alamat, float gajiPokok, float uangMakan, float tunjangan) {
        super(id, nama, alamat);
        this.gajiPokok = gajiPokok;
        this.uangMakan = uangMakan;
        this.tunjangan = tunjangan;
    }

    public float getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(float gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public float getUangMakan() {
        return uangMakan;
    }

    public void setUangMakan(float uangMakan) {
        this.uangMakan = uangMakan;
    }

    public float getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(float tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override
    public float hitungGaji() {
        return this.gajiPokok + this.uangMakan + this.tunjangan;
    }
}
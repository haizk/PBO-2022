public class Segitiga {
    int alas = 3, tinggi = 4, sisiMiring = 5;

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        System.out.println("SEGITIGA");
        System.out.println("Alas\t\t\t"+segitiga.alas+"\tsatuan panjang");
        System.out.println("Tinggi\t\t\t"+segitiga.tinggi+"\tsatuan panjang");
        System.out.println("Sisi miring\t\t"+segitiga.sisiMiring+"\tsatuan panjang");
        System.out.println("Luas segitiga\t\t"+segitiga.hitungLuas()+"\tsatuan luas");
        System.out.println("Keliling segitiga\t"+segitiga.hitungKeliling()+"\tsatuan panjang");
    }

    public Double hitungLuas() {
        Double luas = 0.5 * this.alas * this.tinggi;
        return luas;
    }
    
    public Double hitungKeliling() {
        Double keliling = 1.0 * (this.alas + this.tinggi + this.sisiMiring);
        return keliling;
    }
}

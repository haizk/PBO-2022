public class Kubus {
    int sisiKubus = 5;

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        System.out.println("KUBUS");
        System.out.println("Volume\t\t"+kubus.hitungVolume()+"\tsatuan volume");
        System.out.println("Luas permukaan\t"+kubus.hitungLuasPermukaan()+"\tsatuan luas");
    }

    public Double hitungVolume() {
        Double volume = 0.0;
        volume = Math.pow(this.sisiKubus, 3);
        return volume;
    }
    
    public int hitungLuasPermukaan() {
        int luasPermukaan = 0;
        luasPermukaan = 6 * this.sisiKubus * this.sisiKubus;
        return luasPermukaan;
    }
}

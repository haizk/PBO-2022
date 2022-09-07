import java.util.Scanner;
public class KonversiNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai anda dalam skala 100: ");
        double skalaSeratus = sc.nextDouble();
        sc.close();
        System.out.print("Nilai anda dalam skala 4: " + (skalaSeratus >= 85 ? "4.0 atau A" : (skalaSeratus >= 80 ? "3.7 atau A-" : (skalaSeratus >= 75 ? "3.3 atau B+" : (skalaSeratus >= 70 ? "3.0 atau B" : (skalaSeratus >= 65 ? "2.7 atau C+" : (skalaSeratus >= 60 ? "2.0 atau C" : (skalaSeratus >= 55 ? "1.0 atau D" : "0.0 atau E"))))))));
    }
}

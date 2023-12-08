import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berat barang (kg): ");
        double berat = scanner.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = scanner.nextDouble();
        LayananReguler reguler = new LayananReguler(berat, jarak);
        LayananExpress express = new LayananExpress(berat, jarak);

        System.out.println("Informasi Layanan Reguler:");
        reguler.tampilkanInfo();
        reguler.hitungOngkosKirim();

        System.out.println("\nInformasi Layanan Express:");
        express.tampilkanInfo();
        express.hitungOngkosKirim();
        
        scanner.close();
    }

}

import java.util.Scanner;

public class Main extends Operasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan dua angka:");
        double angka1 = input.nextDouble();
        double angka2 = input.nextDouble();

        Main Kalkulator = new Main();

        System.out.println("Hasil penjumlahan: " + Kalkulator.penjumlahan(angka1,angka2));
        System.out.println("Hasil pengurangan: " + Kalkulator.pengurangan(angka1,angka2));
        System.out.println("Hasil perkalian: " + Kalkulator.perkalian(angka1,angka2));
        System.out.println("Hasil pembagian: " + Kalkulator.pembagian(angka1,angka2));
    }
}
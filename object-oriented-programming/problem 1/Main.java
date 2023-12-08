// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persegi Persegi = new Persegi(4);
        System.out.println("Luas persegi = " + Persegi.luaspersegi());
        System.out.println("Keliling persegi = " + Persegi.hitungKelilingpersegi());

        PersegiPanjang PersegiPanjang = new PersegiPanjang(5, 6);
        System.out.println("Luas PersegiPanjang = " + PersegiPanjang.luaspersegipanjang());
        System.out.println("Keliling PersegiPanjang = " + PersegiPanjang.Kelilingpersegipanjang());

        Segitiga Segitiga = new Segitiga(4,8,4);
        System.out.println("Luas Segitiga = " + Segitiga.luasSegitiga());
        System.out.println("Keliling Segitiga = " + Segitiga.Kelilingsegitiga());
    }

}
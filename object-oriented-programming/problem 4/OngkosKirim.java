
public class OngkosKirim {
    protected double berat;
    protected double jarak;
    OngkosKirim(double berat, double jarak) {
        this.berat = berat;
        this.jarak = jarak;
    }
    void hitungOngkosKirim() {
        System.out.println("Ongkos kirim belum dihitung.");
    }
    void tampilkanInfo() {
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Jarak: " + jarak + " km");
    }
}

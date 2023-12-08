public class LayananExpress extends OngkosKirim {
    LayananExpress(double berat, double jarak) {
        super(berat, jarak);
    }

    @Override
    void hitungOngkosKirim() {
        double ongkos = berat * 3000 + jarak * 1500;
        System.out.println("Ongkos kirim (Layanan Express): Rp " + ongkos);
    }
}

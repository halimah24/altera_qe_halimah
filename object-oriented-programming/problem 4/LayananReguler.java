public class LayananReguler extends OngkosKirim{
    LayananReguler(double berat, double jarak) {
        super(berat, jarak);
    }

    @Override
    void hitungOngkosKirim() {
        double ongkos = berat * 2000 + jarak * 1000;
        System.out.println("Ongkos kirim (Layanan Reguler): Rp " + ongkos);
    }
}

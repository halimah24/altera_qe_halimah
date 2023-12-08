public class Segitiga {
        int alas = 4;
        int tinggi = 8;
        int sisi = 4;

    public Segitiga(int alas, int tinggi, int sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }
    public int luasSegitiga() {
        int hasil = (alas * tinggi / 2);
        return hasil;
    }
    public int Kelilingsegitiga(){
        int keliling = (sisi + sisi + sisi);
        return keliling;
    }
}

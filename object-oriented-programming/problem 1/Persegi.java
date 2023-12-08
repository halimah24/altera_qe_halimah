public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    public int luaspersegi(){
        int hasil = (sisi * sisi);
        return hasil;
    }
    public int hitungKelilingpersegi(){
        int keliling  = 2* this.sisi;
        return keliling;
    }
}

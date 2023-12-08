public class PersegiPanjang {
    int panjang = 10;
    int lebar = 5;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public int luaspersegipanjang(){
        int hasil = (panjang * lebar);
        return hasil;
    }
    public int Kelilingpersegipanjang(){
        int keliling = (2* panjang + lebar);
        return keliling;
    }
}



public class Operasi {
    public double penjumlahan(double angka1, double angka2){
        return angka1 + angka2;
    }
    public double pengurangan(double angka1, double angka2) {
        return  angka1 - angka2;
    }
    public double perkalian(double angka1, double angka2){
        return angka1 * angka2;
    }
    public double pembagian(double angka1, double angka2){
        if (angka2 != 0){
            return angka1 / angka2;
        } else {
            System.out.println("Tidak dapat melakukan pembagian dengan nol.");
            return 0;
        }
    }
}

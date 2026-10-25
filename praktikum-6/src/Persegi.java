public class Persegi {
    double sisi;

    // Constructor parameter
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Menghitung luas persegi
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Menghitung keliling persegi
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

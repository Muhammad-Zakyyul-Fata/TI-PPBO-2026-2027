public class Latihan1 {
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("Luas Persegi Panjang (10 x 5): " + luasPersegiPanjang(10, 5));
        System.out.println("Luas Lingkaran (r = 7): " + luasLingkaran(7));

        System.out.println();

        System.out.println("Luas Persegi Panjang (4.5 x 2.0): " + luasPersegiPanjang(4.5, 2.0));
        System.out.println("Luas Lingkaran (r = 10): " + luasLingkaran(10));
    }
}

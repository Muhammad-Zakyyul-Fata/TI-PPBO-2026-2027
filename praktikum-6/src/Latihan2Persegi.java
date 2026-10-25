public class Latihan2Persegi {
    public static void main(String[] args) {
        Persegi[] daftarPersegi = {
                new Persegi(4),
                new Persegi(7),
                new Persegi(3),
                new Persegi(10),
                new Persegi(6)
        };

        int indeksTerbesar = 0;

        for (int i = 1; i < daftarPersegi.length; i++) {
            if (daftarPersegi[i].hitungLuas() > daftarPersegi[indeksTerbesar].hitungLuas()) {
                indeksTerbesar = i;
            }
        }

        System.out.println("Persegi dengan luas terbesar:");
        System.out.println("Sisi: " + daftarPersegi[indeksTerbesar].sisi);
        System.out.println("Luas: " + daftarPersegi[indeksTerbesar].hitungLuas());
        System.out.println("Keliling: " + daftarPersegi[indeksTerbesar].hitungKeliling());
    }
}

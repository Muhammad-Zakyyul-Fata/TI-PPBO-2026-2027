public class Latihan2Buku {
    public static void main(String[] args) {
        Buku[] daftarBuku = {new Buku("Laskar Pelangi", "Andre Hirata", 2005),
                new Buku("Bumi", "Tere Liye", 2014),
                new Buku("Laut Bercerita", "Leila S. Chudori", 2017),
                new Buku("Pulang", "Tere Liye", 2021),
                new Buku("Dilan : 1990", "Pidi Baiq", 1990)};

        System.out.println("Buku yang terbit setelah 2015:");

        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].tahunTerbit > 2015) {
                System.out.println(daftarBuku[i].judul);
            }
        }
    }
}

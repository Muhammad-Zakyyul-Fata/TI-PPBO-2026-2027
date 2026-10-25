public class TokoDemo {
    public static void main(String[] args) {

        // Array of Object berisi 5 produk olahraga
        ProdukClass[] daftarProduk = {
                new ProdukClass("001", "Sepatu Bola Nike", 1250000, 15),
                new ProdukClass("002", "Bola Molten", 450000, 10),
                new ProdukClass("003", "Jersey Barcelona", 1000000, 50),
                new ProdukClass("004", "Tas Padel", 500000, 8),
                new ProdukClass("005", "Sepatu Futsal Specs", 750000, 26)
        };

        System.out.println("======================================");
        System.out.println("     TOKO PERLENGKAPAN OLAHRAGA");
        System.out.println("======================================");

        for (int i = 0; i < daftarProduk.length; i++) {
            daftarProduk[i].tampilkanData();
        }

        // Pembelian pertama: stok tidak mencukupi
        System.out.println("\n=== SIMULASI PEMEBELIAN PERTAMA ===");

        ProdukClass produk1 = daftarProduk[0];
        int jumlahBeli1 = 2;

        System.out.println("Produk: " + produk1.namaProduk);
        System.out.println("Jumlah Beli: " + jumlahBeli1);
        System.out.printf("Total harga: Rp %,.0f%n", produk1.hitungTotalHarga(jumlahBeli1));

        produk1.kurangiStok(jumlahBeli1);

        // Pembelian kedua: stok tidak mencukupi
        System.out.println("\n=== SIMULASI PEMBELIAN KEDUA ===");

        ProdukClass produk2 = daftarProduk[4];
        int jumlahBeli2 = 10;

        System.out.println("Produuk: " + produk2.namaProduk);
        System.out.println("Jumlah Beli: " + jumlahBeli2);

        System.out.printf("Total harga: Rp %,.0f%n", produk2.hitungTotalHarga(jumlahBeli2));

        produk2.kurangiStok(jumlahBeli2);

        // Mencari produk dengan harga termahal
        System.out.println("\n=== PRODUK DENGAN HARGA TERMAHAL===");

        ProdukClass termahal = daftarProduk[0];

        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].harga > termahal.harga) {
                termahal = daftarProduk[i];
            }
        }

        termahal.tampilkanData();

    }
}

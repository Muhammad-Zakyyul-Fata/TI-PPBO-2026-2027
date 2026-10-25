public class ProdukClass {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // Constructor
    public ProdukClass(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Menghitung total harga pembelian
    public double hitungTotalHarga(int jumlahBeli){
        return harga * jumlahBeli;
    }

    // Mengurangi stok produk
    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pembelian harus lebih dari 0.");
        } else if (stok >= 0) {
            stok -= jumlah;
            System.out.println("Pembelian berhasil.");
            System.out.println("Sisa stok: " + stok);
        } else {
            System.out.println("Stok tidak mencukupi.");
            System.out.println("Stok tersedia: " + stok);
        }
    }

    // Menampilkan data produk
    public void tampilkanData() {
        System.out.println("--------------------------------------");
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.printf("Harga       : Rp %,.0fn", harga );
        System.out.println("Stok        : " + stok);
    }
}

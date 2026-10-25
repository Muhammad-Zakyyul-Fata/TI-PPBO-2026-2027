public class LatihanProduk {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Handphone", 200000);
        Produk produk2 = new Produk("Keyboard", 250000);

        double batasHarga = 100000;

        System.out.println("Produk: " + produk1.namaProduk);
        System.out.println("Harga: " + produk1.harga);
        System.out.println("Mahal: " + produk1.isMahal(batasHarga));

        System.out.println();

        System.out.println("Produk: " + produk2.namaProduk);
        System.out.println("Harga: " + produk2.harga);
        System.out.println("Mahal: " + produk2.isMahal(batasHarga));
    }
}

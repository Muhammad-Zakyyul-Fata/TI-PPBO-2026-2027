public class LatihanBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Tentang Kamu", "Tere Liye", 2016);
        Buku buku2 = new Buku("Negeri 5 Menara", "Ahamad fuadi", 2008);

        buku1.tampilkanData();
        System.out.println();

        buku2.tampilkanData();
    }
}

public class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    // Constructor parameter
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan data buku
    public void tampilkanData() {
        System.out.println("Judul: " + judul);
        System.out.println("Penagarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}

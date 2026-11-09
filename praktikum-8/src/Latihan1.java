public class Latihan1 {
    public static void main(String[] args) {

        Kucing kucing = new Kucing();
        kucing.nama = "Mumu";

        Anjing anjing = new Anjing();
        anjing.nama = "Bruno";

        System.out.println("=== DATA HEWAN ===");

        System.out.println("Nama Kucing: " + kucing.nama);
        kucing.bersuara();

        System.out.println();

        System.out.println("Nama Anjing: " + anjing.nama);
        anjing.bersuara();

    }
}

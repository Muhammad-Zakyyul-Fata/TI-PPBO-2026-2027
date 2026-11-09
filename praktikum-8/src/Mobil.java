public class Mobil extends Kendaraan {
    protected int jumlahPintu;

    public Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfo() {
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Kecepatan Maksimal: " + kecepatanMaks + " km/jam");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
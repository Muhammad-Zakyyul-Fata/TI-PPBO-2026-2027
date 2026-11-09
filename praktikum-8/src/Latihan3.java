public class Latihan3 {
    public static void main(String[] args) {

        Mobil mobil = new Mobil("Mitsubishi", 200, 4);
        Motor motor = new Motor("Yamaha", 150, "Sport");

        System.out.println("=== DATA MOBIL ===");
        mobil.tampilkanInfo();

        System.out.println("\n=== DATA MOTOR ===");
        motor.tampilkanInfo();
    }
}
public class Latihan2 {
    public static void main(String[] args) {

        Mobil mobil = new Mobil("Mitsubishi", 200, 4);
        Motor motor = new Motor("Yamaha", 150, "Sport");

        System.out.println("=== DATA MOBIL ===");
        mobil.tampilkanInfo();

        System.out.println("\n=== DATA MOTOR ===");
        System.out.println("Merek Motor: " + motor.merek);
        System.out.println("Kecepatan Maksimal: " + motor.kecepatanMaks + " km/jam");
        System.out.println("Jenis Motor: " + motor.jenisMotor);
    }
}
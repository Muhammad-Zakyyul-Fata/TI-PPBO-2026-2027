import java.util.Scanner;

public class TiketBioskop {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan umur: ");
            int umur = input.nextInt();

            System.out.print("Apakah kamu mahasiswa? (true/false): ");
            boolean isMahasiswa = input.nextBoolean();

            int hargaTiket;

            // Mahasiswa berusia di bawah 25 tahun mendapat harga khusus (Rp30.000)
            if (isMahasiswa && umur > 25) {
                hargaTiket = 30000;
                System.out.println("Kategori: Tiket Mahasiswa Khusus");
            } else if (umur < 12) {
                hargaTiket = 25000;
                System.out.println("Kategori: Tiket Anak-anak");
            } else {
                hargaTiket = 50000;
                System.out.println("Kategori: Tiket Reguler");
            }

            System.out.println("Harga Tiket: Rp" + hargaTiket);

            input.close();
    }
}

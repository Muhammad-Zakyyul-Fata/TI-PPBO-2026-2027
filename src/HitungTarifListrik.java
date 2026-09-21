import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {

        // Deklarasi konstanta tarif per kWh untuk tiap golongan
        final double TARIF_450 = 415.0;
        final double TARIF_900 = 1352.0;
        final double TARIF_1300 = 1444.70;
        final double TARIF_2200 = 1444.70;
        final double TARIF_DI_ATAS_2200 = 1700.0;

        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM PENGHITUNG LISTRK ===");
        System.out.println("Pilihan Golongan Daya (VA): ");
        System.out.println("1. 450 VA");
        System.out.println("2. 900 VA");
        System.out.println("3. 1300 VA");
        System.out.println("4. 2200 VA");
        System.out.println("5, Di atas 2200 VA");
        System.out.println("Masukkan pilihan golongan daya (1-5): ");
        int pilihanDaya = input.nextInt();

        System.out.print("Maukkan jumlah pemakaian listrik (kWh): ");
        double kwh = input.nextDouble();

        //  Validasi input pemakaian kWh (harus > 0)
        if (kwh <= 0) {
            System.out.println("\n[ERROR] Jumlah pemakaian kWh tidak valid! Harus lebih besar dari 0.");
        } else {
            double tarifPerKwh = 0;
            String labelDaya = "";
            boolean inputValid = true;

            // Menentukan tarif berdasarkan pilihan golongan daya menggunakan switch-case
            switch (pilihanDaya) {
                case 1:
                    labelDaya = "450 VA";
                    tarifPerKwh = TARIF_450;
                    break;
                case 2:
                    labelDaya = "900 VA";
                    tarifPerKwh = TARIF_900;
                    break;
                case 3:
                    labelDaya = "1300 VA";
                    tarifPerKwh = TARIF_1300;
                    break;
                case 4:
                    labelDaya = "2200 VA";
                    tarifPerKwh = TARIF_2200;
                    break;
                case 5:
                    labelDaya = "> 2200 VA";
                    tarifPerKwh = TARIF_DI_ATAS_2200;
                    break;
                default:
                    inputValid = false;
                    System.out.println("\n[ERROR] Pilihan golongan daya tidak valid!");
                    break;
            }

            // Jika semua input valid, tampilkan rincian tagihan
            if (inputValid) {
                double totalTagihan = kwh * tarifPerKwh;

                System.out.println("\n====================================");
                System.out.println("       RINCIAN TAGIHAN LISTRIK     ");
                System.out.println("Golongan Daya : " + labelDaya);
                System.out.println("Pemakaian     : " + kwh + " kWh");
                System.out.printf("Tarif per kWh : Rp%.2f\n", tarifPerKwh);
                System.out.println("---------------------------------");
                System.out.printf("Total Tagihan : Rp%.2f\n", totalTagihan);
                System.out.println("==================================");
            }
        }

        input.close();
    }
}

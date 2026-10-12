import java.util.Scanner;

public class KalkulatorMethod {
    // Method penhjumlahan 2 angka
    public static double tambah(double a, double b) {
        return a + b;
    }

    // Method overloading: penjumlahan 3 angka
    public static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // Method pengurangan
    public static double kurang(double a, double b) {
        return a - b;
    }

    // Method perkaliam
    public static double kali(double a, double b) {
        return a * b;
    }

    // Method pembagian
    public static double bagi(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol!");
        }
        return a / b;
    }

    // Method perpangkatan
    public static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    // Method akar kuadrat
    public static double akarKuadrat(double a) {
        if (a < 0) {
            throw new ArithmeticException("Angka tidak bole negatif!");
        }
        return Math.sqrt(a);
    }

    // Method mencari hasil terbesar dari riwayat
    public static double riwayatKeMaksimum(double[] riwayatHasil) {
        if (riwayatHasil.length == 0) {
            return 0;
        }

        double maksimum = riwayatHasil[0];

        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > maksimum) {
                maksimum = riwayatHasil[i];
            }
        }

        return maksimum;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        // Array untuk menyimpan riwayat hasil perhitungan
        double[] riwayatHasil = new double[1000];
        int jumlahRiwayat = 0;

        int pilihan;
        double a, b, c, hasil;

        do {
            System.out.println("\n====== KALKULATOR METHOD ======");
            System.out.println("1. Penjumlahan 2 angka");
            System.out.println("2. Penjumlahan 3 angka");
            System.out.println("3. Pengurangan");
            System.out.println("4. Perkalian");
            System.out.println("5. Pembagian");
            System.out.println("6. Perpangkatan");
            System.out.println("7. Akar kuadrat");
            System.out.println("0. Keluar");
            System.out.print("Pilih Operasi: ");

            pilihan = input.nextInt();

            try {
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan angka pertama: ");
                        a = input.nextDouble();
                        System.out.print("Masukkan angka kedua: ");
                        b = input.nextDouble();

                        hasil = tambah(a, b);
                        System.out.println("Hasil =" + hasil);
                        riwayatHasil[jumlahRiwayat++] = hasil;
                        break;

                    case 2:
                        System.out.print("Masukkan angka pertama: ");
                        a = input.nextDouble();
                        System.out.print("Masukkan angka kedua: ");
                        b = input.nextDouble();
                        System.out.println("Masukkan angka ketiga: ");
                        c = input.nextDouble();

                        hasil = tambah(a, b, c);
                        System.out.println("Hasil =" + hasil);
                        riwayatHasil[jumlahRiwayat++] = hasil;
                        break;

                    case 3:
                        System.out.print("Masukkan angka pertama: ");
                        a = input.nextDouble();
                        System.out.print("Masukkan angka kedua: ");
                        b = input.nextDouble();

                        hasil = kurang(a, b);
                        System.out.println("Hasil =" + hasil);
                        riwayatHasil[jumlahRiwayat++] = hasil;
                        break;

                    case 4:
                        System.out.print("Masukkan angka pertama: ");
                        a = input.nextDouble();
                        System.out.print("Masukkan angka kedua: ");
                        b = input.nextDouble();

                        hasil = kali(a, b);
                        System.out.println("Hasil =" + hasil);
                        riwayatHasil[jumlahRiwayat++] = hasil;
                        break;

                    case 5:
                        System.out.print("Masukkan angka pertama: ");
                        a = input.nextDouble();
                        System.out.print("Masukkan angka kedua: ");
                        b = input.nextDouble();

                        hasil = bagi(a, b);
                        System.out.println("Hasil =" + hasil);
                        riwayatHasil[jumlahRiwayat++] = hasil;
                        break;

                    case 6:
                        System.out.print("Masukkan bilangan dasar: ");
                        a = input.nextDouble();
                        System.out.print("Masukkan pangkat: ");
                        b = input.nextDouble();

                        hasil = pangkat(a, b);
                        System.out.println("Hasil =" + hasil);
                        riwayatHasil[jumlahRiwayat++] = hasil;
                        break;

                    case 7:
                        System.out.print("Masukkan angka: ");
                        a = input.nextDouble();

                        hasil = akarKuadrat(a);
                        System.out.println("Hasil =" + hasil);
                        riwayatHasil[jumlahRiwayat++] = hasil;
                        break;

                    case 0:
                        System.out.println("\nProgram kalkulator selesai.");

                        if (jumlahRiwayat > 0) {
                            // Menyalin riwayat sesuai jumlah perhitungan
                            double[] riwayatAktual =
                                    new double[jumlahRiwayat];

                            for (int i = 0; i < jumlahRiwayat; i++) {
                                riwayatAktual[i] = riwayatHasil[i];
                            }

                            System.out.println("Hasil maksimum dari seluruh perhitungan =" + riwayatKeMaksimum(riwayatAktual));
                        } else {
                            System.out.println("Belum ada hasil perhitungan");
                        }
                        break;

                    default:
                        System.out.println("Pilihan tidak valid! Silakan coba lagi.");


                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (pilihan != 0);

        input.close();
    }

}

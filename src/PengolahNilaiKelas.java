import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Menentukan nilai KKM
        int KKM = 70;

        // Meminta jumlah mahasiswa
        System.out.println("===========================================");
        System.out.println("        PROGRAM PENGOLAH NILAI KELAS       ");
        System.out.println("===========================================");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = input.nextInt();

        // Membuat Array untuk menyimpan nilai mahasiswa
        int[] nilai = new int[N];

        // Membaca nilai setiap mahasiswa menggunakan for loop
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai mahaisswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Menampilkan nilai sebelum diurutkan
        System.out.println("\n=========================================");
        System.out.println("          NILAI SEBELUM DIURUTKAN          ");
        System.out.println("=========================================");

        for (int i =0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();

        // Menghitung jumlah seluruh nilai
        int total = 0;

        // Menentukan nilai tertinggi dan terendah
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        // Menghitung jumlah mahasiswa lulus dan tidak lulus
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        // Melakukan perulangan untuk menghitung data nilai
        for (int i = 0; i < N; i++) {
            total += nilai[i];
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }

            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }

            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Menghitung nilai rata-rata
        double rataRata = (double) total / N;

        // Menghitung hasil perhitungan
        System.out.println("\n====================================");
        System.out.println("         LAPORAN NILAI KELAS          ");
        System.out.println("===================================");
        System.out.printf("Nilai Rata-rata    : %.2f%n", rataRata);
        System.out.println("Nilai Tertinggi    : " + nilaiTertinggi);
        System.out.println("Nilai Terendah     : " + nilaiTerendah);
        System.out.println("KKM                : " + KKM);
        System.out.println("Jumlah Mahasiswa   : " + N);
        System.out.println("Jumlah Lulus       : " + jumlahLulus);
        System.out.println("Jumlah Tidak Lulus : " + jumlahTidakLulus);

        // Proses pengurutan menggunakan algoritma Bubble Sort
        // Nilai diurutkan dari nilai yang terkecil ke yang terbesar
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {

                // Membandingkan dua nilai yang bersebelahan
                if (nilai[j] > nilai[j + 1]) {

                    // Menukar nilai
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // Menampilkan nilai setelah diurutkan
        System.out.println("\n======================================");
        System.out.println("        NILAI SETELAH DIURUTKAN         ");
        System.out.println("========================================");

        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\n======================================");

        input.close();

    }
}

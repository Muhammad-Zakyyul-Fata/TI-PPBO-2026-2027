import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array:");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array harus memiliki 2 elemen.");
            scanner.close();
            return;
        }

        int[] angka = new int[n];
        System.out.println("Masukkan " + n + " angka:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        int terbesar = Integer.MIN_VALUE;
        int terbesarKedua = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (angka[i] > terbesar) {
                terbesarKedua = terbesar;
                terbesar = angka[i];
            } else if (angka[i] > terbesarKedua && angka[i] != terbesar) {
                terbesarKedua = angka[i];
            }
        }

        if (terbesarKedua == Integer.MIN_VALUE) {
            System.out.println("\nTidak ada nilai terbesar kedua (semua elemen bernilai sama).");
        } else {
            System.out.println("\nNilai terbesar kedua adalah: " + terbesarKedua);
        }

        scanner.close();
    }
}

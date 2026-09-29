import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        int[] angka = new int[n];
        System.out.println("Masukkan " + n + "angka:");
        for (int i =  0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        System.out.print("\nArray sebelum diururtkan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        // Algoritma Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }

        System.out.print("Array sesudah diurutkan (ascending): ");
        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}

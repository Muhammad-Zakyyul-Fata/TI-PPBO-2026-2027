import java.util.Scanner;

public class GanjildanGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan bulat: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan Genap.");
        } else {
            System.out.println(angka + " adalah bilangan Ganjil.");
        }

        input.close();
    }
}

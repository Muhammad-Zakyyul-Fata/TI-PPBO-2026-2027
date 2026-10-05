import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Sate Ayam");
        System.out.print("Pilih Menu (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Kamu memilih: Nasi Goreng");
                break;
            case 2:
                System.out.println("Kamu memilih: Mie Ayam");
            case 3:
                System.out.println("Kamu memilih: Bakso");
            case 4:
                System.out.println("Kamu memilih: Sate Ayam");
            default:
                System.out.println("Pilihan tidak valid!");
                break;

        }


    }
}

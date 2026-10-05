import java.util.Scanner;

public class KlasifikasiBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiCm = input.nextDouble();

        //Konversi tinggi ke meter
        double tinggiM = tinggiCm / 100;

        //Hitung BMI
        double bmi = berat / (tinggiM * tinggiM);

        System.out.printf("Nilai BMI kamu: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else {
            if (bmi < 25.0) {
                System.out.println("Kategori: Normal");
            } else {
                if (bmi < 30.0) {
                    System.out.println("Kategori: Gemuk");
                } else {
                    System.out.println("Kategori: Obesitas");
                }
            }
        }

        input.close();
    }
}

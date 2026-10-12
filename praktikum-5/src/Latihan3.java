public class Latihan3 {
    static double konversiSuhu(double celcius) {
        return (celcius * 9 / 5) + 32;
    }

    static double konversiSuhu(double celcius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Fahrenheit") || skalaTujuan.equalsIgnoreCase("F")) {
            return (celcius * 9 / 5) +32;

        }else if (skalaTujuan.equalsIgnoreCase("Kelvin") || skalaTujuan.equalsIgnoreCase("K")) {
            return celcius + 273.15;
        }else {
            System.out.println("Skala tidak dikenal. Mengembalikan nilai awal.");
            return celcius;
        }
    }

    public static void main(String[] args) {
        double suhu = 100.0;

        System.out.println(suhu + " C ke Fahrenheit =" + konversiSuhu(suhu));
        System.out.println(suhu + " C ke Kelvin =" + konversiSuhu(suhu, "Kelvin"));
        System.out.println(suhu + " C ke Fahrenheit =" + konversiSuhu(suhu, "Fahrenheit"));
    }
}

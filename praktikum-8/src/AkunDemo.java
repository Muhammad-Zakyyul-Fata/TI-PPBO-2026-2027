public class AkunDemo {
    public static void main(String[] args) {

        AkunPremium akun = new AkunPremium(
                "zakyyul_fata",
                5000000,
                300000
        );

        System.out.println("=== INFORMASI AKUN PREMIUM ===");
        akun.cekLimit();
    }
}

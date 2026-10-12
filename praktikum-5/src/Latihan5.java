public class Latihan5 {

    static int hitungTotal(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }

    static int[] filterDiAtasRataRata(int[] data) {
        double rataRata = (double) hitungTotal(data) / data.length;

        int count = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                count++;
            }
        }

        int[] hasil = new int[count];
        int idx = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[idx] = nilai;
                idx++;
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        int[] nilai = {70, 85, 60, 90, 75, 80};

        int total= hitungTotal(nilai);
        double rataRata = (double) total / nilai.length;

        System.out.println("Total Nilai    :" + total);
        System.out.println("Rata-rata Nilai:" + rataRata);

        int[] terfilter = filterDiAtasRataRata(nilai);
        System.out.print("Nilai di atas rata-rata: ");
        for (int n : terfilter) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

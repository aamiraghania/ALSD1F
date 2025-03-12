import java.util.Scanner;

public class Mainlatprak {

    public static int maxUTSDC(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
        int mid = (left + right) / 2;
        int maxLeft = maxUTSDC(uts, left, mid);
        int maxRight = maxUTSDC(uts, mid + 1, right);
        return Math.max(maxLeft, maxRight);
    }

    public static int minUTSDC(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
        int mid = (left + right) / 2;
        int minLeft = minUTSDC(uts, left, mid);
        int minRight = minUTSDC(uts, mid + 1, right);
        return Math.min(minLeft, minRight);
    }

    public static double averageUASBruteForce(int[] uas) {
        int total = 0;
        for (int i = 0; i < uas.length; i++) {
            total += uas[i];
        }
        return (double) total / uas.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa[] mahasiswa = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        int[] uts = new int[mahasiswa.length];
        int[] uas = new int[mahasiswa.length];

        for (int i = 0; i < mahasiswa.length; i++) {
            uts[i] = mahasiswa[i].nilaiUTS;
            uas[i] = mahasiswa[i].nilaiUAS;
        }

        int nilaiUTSTertinggi = maxUTSDC(uts, 0, uts.length - 1);
        System.out.println("Nilai UTS tertinggi : " + nilaiUTSTertinggi);

        int nilaiUTSTerendah = minUTSDC(uts, 0, uts.length - 1);
        System.out.println("Nilai UTS terendah  : " + nilaiUTSTerendah);

        double rataRataUAS = averageUASBruteForce(uas);
        System.out.println("Rata-rata nilai UAS -: " + rataRataUAS);
    }
}
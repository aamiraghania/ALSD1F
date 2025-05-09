import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        double sisi;

        do {
            tampilkanMenu();

            System.out.print("Masukkan pilihan Anda (1-4): ");
            pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                sisi = scanner.nextDouble();

                switch (pilihan) {
                    case 1:
                        double volume = hitungVolumeKubus(sisi);
                        System.out.println("Volume kubus adalah: " + volume);
                        break;
                    case 2:
                        double luasPermukaan = hitungLuasPermukaanKubus(sisi);
                        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);
                        break;
                    case 3:
                        double keliling = hitungKelilingKubus(sisi);
                        System.out.println("Keliling kubus (total panjang rusuk) adalah: " + keliling);
                        break;
                }
            } else if (pilihan != 4) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 4);

        System.out.println("Program selesai. Terima kasih!");
        scanner.close();
    }

    public static void tampilkanMenu() {
        System.out.println("\nMenu Perhitungan Kubus:");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
    }

    public static double hitungVolumeKubus(double sisi) {
        return Math.pow(sisi, 3); // Volume = sisi^3
    }

    public static double hitungLuasPermukaanKubus(double sisi) {
        return 6 * Math.pow(sisi, 2); // Luas permukaan = 6 * sisi^2
    }

    public static double hitungKelilingKubus(double sisi) {
        return 12 * sisi; // Keliling = 12 * sisi
    }
}

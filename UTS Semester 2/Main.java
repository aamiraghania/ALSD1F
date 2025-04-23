import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManajemenDosen md = new ManajemenDosen();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Sistem Data Dosen:");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Urutkan Berdasarkan NIDN");
            System.out.println("3. Cari Berdasarkan Nama");
            System.out.println("4. Urutkan Berdasarkan Masa Kerja");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1 -> md.tampilkanSemuaDosen();
                case 2 -> md.urutkanNIDN();
                case 3 -> {
                    System.out.print("Masukkan nama yang dicari: ");
                    String nama = sc.nextLine();
                    md.cariNama(nama);
                }
                case 4 -> md.urutkanMasaKerja();
                case 0 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}

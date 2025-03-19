import java.util.Scanner;

public class MainMenu01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen01 data = new DataDosen01();
        int pilihan;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia termuda -> tertua)");
            System.out.println("4. Sorting DSC (Usia tertua -> termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    // Tambah Data Dosen
                    System.out.print("Masukkan kode dosen: ");
                    String kode = sc.next();
                    System.out.print("Masukkan nama dosen: ");
                    String nama = sc.next();
                    System.out.print("Masukkan jenis kelamin (true = Laki-laki, false = Perempuan): ");
                    boolean jenisKelamin = sc.nextBoolean();
                    System.out.print("Masukkan usia dosen: ");
                    int usia = sc.nextInt();

                    Dosen01 dsn = new Dosen01(kode, nama, jenisKelamin, usia);
                    data.tambah(dsn);
                    break;

                case 2:
                    // Tampil Data Dosen
                    data.tampil();
                    break;

                case 3:
                    // Sorting ASC
                    data.sortingASC();
                    break;

                case 4:
                    // Sorting DSC
                    data.sortingDSC();
                    break;

                case 5:
                    // Keluar
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}

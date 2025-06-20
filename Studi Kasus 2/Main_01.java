import java.util.Scanner;

public class Main_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPasien_01 antrian = new AntrianPasien_01();
        QueueTransaksi_01 transaksiQueue = new QueueTransaksi_01(100);

        int nomorAntrian = 1; //penambahan
        while (true) {
            System.out.println("\n=== SISTEM ANTRIAN PASIEN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("6. Hitung Rata-Rata Durasi Layanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Nama pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("NIK : ");
                    String nik = sc.nextLine();
                    System.out.print("Keluhan : ");
                    String keluhan = sc.nextLine();
                    String kodeAntrian = String.format("A%03d", nomorAntrian); // Format: A001, A002, dst.
                    nomorAntrian++;
                    Pasien_01 pasien = new Pasien_01(nama, nik, keluhan, kodeAntrian);
                    antrian.tambahPasien(pasien);

    System.out.println(">> Pasien masuk ke antrian dengan kode: " + kodeAntrian);
                    break;
                case 2:
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    Pasien_01 p = antrian.layaniPasien();
                    if (p == null) {
                        System.out.println(">> Tidak ada pasien di antrian.");
                    } else {
                        System.out.println("Pasien " + p.nama + " dipanggil");
                        System.out.print("ID Dokter: ");
                        String idDokter = sc.nextLine();
                        System.out.print("Nama Dokter: ");
                        String namaDokter = sc.nextLine();
                        System.out.print("Durasi layanan (jam): ");
                        double durasi = sc.nextDouble();
                        sc.nextLine();
                        Dokter_01 d = new Dokter_01(idDokter, namaDokter);
                        TransaksiLayanan_01 t = new TransaksiLayanan_01(p, d, durasi);
                        transaksiQueue.enqueue(t);
                        System.out.println(">> Pasien telah dilayani,transaksi berhasil dicatat.");
                    }
                    break;
                case 4:
                    System.out.println(">> Sisa pasien dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 5:
                    transaksiQueue.tampilkanRiwayat();
                    System.out.println("Jumlah pasien yang telah dilayani: " + transaksiQueue.getJumlahTransaksi());
                    break;
                case 6:
                    if (transaksiQueue.getJumlahTransaksi() == 0) {
                        System.out.println(">> Belum ada pasien yang dilayani.");
                    } else {
                        double rataRata = transaksiQueue.hitungRataRataDurasi();
                        System.out.printf(">> Rata-rata durasi layanan: %.2f jam\n", rataRata);
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
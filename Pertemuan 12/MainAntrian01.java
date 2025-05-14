import java.util.Scanner;

public class MainAntrian01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueAntrian01 antrian = new QueueAntrian01();
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Tampilkan Antrian Terdepan");
            System.out.println("6. Tampilkan Antrian Terakhir");
            System.out.println("7. Tampilkan Semua Antrian");
            System.out.println("8. Tampilkan Jumlah Antrian");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    antrian.enqueue(new MahasiswaSoal01(nim, nama));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 4:
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 5:
                    antrian.peekFront();
                    break;
                case 6:
                    antrian.peekRear();
                    break;
                case 7:
                    antrian.tampilAntrian();
                    break;
                case 8:
                    antrian.jumlahAntrian();
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }
}

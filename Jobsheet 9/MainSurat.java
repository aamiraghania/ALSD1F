import java.util.Scanner;

public class MainSurat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat stack = new StackSurat();
        int pilihan;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scan.nextInt();
            scan.nextLine(); // flush newline

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char izin = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine(); // flush newline

                    Surat surat = new Surat(id, nama, kelas, izin, durasi);
                    stack.push(surat);
                    break;

                case 2:
                    Surat diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat yang diproses:");
                        diproses.tampilkanSurat();
                    }
                    break;

                case 3:
                    Surat terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir:");
                        terakhir.tampilkanSurat();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);
    }
}
import java.util.Scanner;

public class tugas3 {

    // Array untuk menyimpan data mata kuliah
    private String[] namaMataKuliah;
    private int[] sks;
    private int[] semester;
    private String[] hariKuliah;
    private int n;

    // Konstruktor untuk menginisialisasi array
    public tugas3(int n) {
        this.n = n;
        namaMataKuliah = new String[n];
        sks = new int[n];
        semester = new int[n];
        hariKuliah = new String[n];
    }

    // Method untuk memasukkan data mata kuliah
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine();  // Mengkonsumsi newline character setelah input integer
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }
    }

    // Method untuk menampilkan seluruh jadwal kuliah
    public void tampilkanJadwal() {
        System.out.println("\nJadwal Kuliah Seluruh Mata Kuliah:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nama Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
        }
    }

    // Method untuk menampilkan jadwal kuliah berdasarkan hari tertentu
    public void tampilkanJadwalBerdasarkanHari(String hari) {
        System.out.println("\nJadwal Kuliah Hari " + hari + ":");
        for (int i = 0; i < n; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println("Nama Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i]);
            }
        }
    }

    // Method untuk menampilkan jadwal kuliah berdasarkan semester tertentu
    public void tampilkanJadwalBerdasarkanSemester(int semester) {
        System.out.println("\nJadwal Kuliah Semester " + semester + ":");
        for (int i = 0; i < n; i++) {
            if (this.semester[i] == semester) {
                System.out.println("Nama Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Hari: " + hariKuliah[i]);
            }
        }
    }

    // Method untuk mencari mata kuliah berdasarkan nama
    public void cariMataKuliah(String nama) {
        boolean ditemukan = false;
        System.out.println("\nMencari Mata Kuliah: " + nama);
        for (int i = 0; i < n; i++) {
            if (namaMataKuliah[i].equalsIgnoreCase(nama)) {
                System.out.println("Nama Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah dengan nama \"" + nama + "\" tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Mengkonsumsi newline character setelah input integer

        // Membuat objek JadwalKuliah
        tugas3 jadwal = new tugas3(n);

        // Input data mata kuliah
        jadwal.inputData();

        // Menu untuk pengguna memilih aksi
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Mengkonsumsi newline character setelah input integer

            switch (pilihan) {
                case 1:
                    jadwal.tampilkanJadwal();
                    break;
                case 2:
                    System.out.print("Masukkan hari yang ingin dicari: ");
                    String hari = scanner.nextLine();
                    jadwal.tampilkanJadwalBerdasarkanHari(hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin dicari: ");
                    int semester = scanner.nextInt();
                    jadwal.tampilkanJadwalBerdasarkanSemester(semester);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String nama = scanner.nextLine();
                    jadwal.cariMataKuliah(nama);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}

import java.util.Scanner;

public class MahasiswaDemo01 {

    public static void main(String[] args) {
        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa yang ingin diinput: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        list.listMhs = new Mahasiswa01[jumMhs];

        for(int i=0; i<jumMhs; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("---------------------------------");
            Mahasiswa01 mhs = new Mahasiswa01(nim, nama, kelas, ipk);
            list.tambah(new Mahasiswa01(nim, nama, kelas, ipk));
        }

        list.tampil();
        //melakukan pencarian data sequential
        // System.out.println("---------------------------------------------");
        // System.out.println("Pencarian data");
        // System.out.println("---------------------------------------------");
        // System.out.println("masukkan ipk mahasiswa yang dicari: ");
        // System.out.print("IPK: ");
        // double cari = sc.nextDouble();

        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        //melakukan pencarian data Binary
        System.out.println("------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("-----------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-----------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        
        Mahasiswa01 m1 = new Mahasiswa01("123", "Zidan", "2A", 3.2);
        Mahasiswa01 m2 = new Mahasiswa01("124", "Ayu", "2A", 3.5);
        Mahasiswa01 m3 = new Mahasiswa01("125", "Sofi", "2A", 3.1);
        Mahasiswa01 m4 = new Mahasiswa01("126", "Sita", "2A", 3.9);
        Mahasiswa01 m5 = new Mahasiswa01("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :  ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}

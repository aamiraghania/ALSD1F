public class MahasiswaMain_01 {
    public static void main(String[] args) {

        Mahasiswa_01 mhs1 = new Mahasiswa_01("244107060081", "Aamira Faheema Ghania", 2024);
        Mahasiswa_01 mhs2 = new Mahasiswa_01("244107060123", "Clarissa Aurelia", 2024);

        MataKuliah_01 mk1 = new MataKuliah_01("MK101", "Algoritma dan Struktur Data", 3);
        MataKuliah_01 mk2 = new MataKuliah_01("MK102", "Basis Data", 4);

        mhs1.tambahMataKuliah(mk1);
        mhs1.tambahMataKuliah(mk2);

        mhs1.tampilkanInfo();

        System.out.println("Total SKS yang diambil oleh " + mhs1.nama + ": " + mhs1.hitungTotalSKS());
        System.out.println();

        MataKuliah_01 mk3 = new MataKuliah_01("MK103", "Sistem Operasi", 2);
        mhs2.tambahMataKuliah(mk3);

        mhs2.tampilkanInfo();
        System.out.println("Total SKS yang diambil oleh " + mhs2.nama + ": " + mhs2.hitungTotalSKS());
    }
}

import java.util.ArrayList;

public class Mahasiswa_01 {
     String nim;
     String nama;
     int tahunMasuk;
     ArrayList<MataKuliah_01> mataKuliahDiambil;

    public Mahasiswa_01(String nim, String nama, int tahunMasuk) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.mataKuliahDiambil = new ArrayList<>();
    }

    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println();
        System.out.println("Mata Kuliah yang Diambil:");
        for (MataKuliah_01 mk : mataKuliahDiambil) {
            mk.tampilkanInfo();
        }
    }

    public void tambahMataKuliah(MataKuliah_01 mataKuliah) {
        mataKuliahDiambil.add(mataKuliah);
    }

    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (MataKuliah_01 mk : mataKuliahDiambil) {
            totalSKS += mk.getSks();
        }
        return totalSKS;
    }
}

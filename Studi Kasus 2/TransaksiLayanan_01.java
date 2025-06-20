public class TransaksiLayanan_01 {
    Pasien_01 pasien;
    Dokter_01 dokter;
    double durasiLayanan;
    int biaya;

    public TransaksiLayanan_01(Pasien_01 pasien, Dokter_01 dokter, double durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = (int) (50000 * durasiLayanan);
    }

    public void tampilkanTransaksi() {
        System.out.println(pasien.nama + " (" + durasiLayanan + " jam) Rp." + biaya);
    }
}

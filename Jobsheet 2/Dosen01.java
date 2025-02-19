public class Dosen01 {
    
    private String idDosen;
    private String nama;
    private boolean statusAktif;
    private int tahunBergabung;
    private String bidangKeahlian;

    public Dosen01() {
        this.idDosen = "Unknown";
        this.nama = "Unknown";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "Unknown";
    }

    public Dosen01(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status aktif telah diubah menjadi: " + (status ? "Aktif" : "Tidak Aktif"));
    }

    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }
}

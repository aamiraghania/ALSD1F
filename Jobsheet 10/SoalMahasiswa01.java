public class SoalMahasiswa01 {
    private String nim;
    private String nama;
    private String prodi;
    private String kelas;

    public SoalMahasiswa01(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Prodi: " + prodi + ", Kelas: " + kelas);
    }
}

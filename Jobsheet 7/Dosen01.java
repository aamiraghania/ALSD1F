public class Dosen01 {
    private String kode;
    private String nama;
    private boolean jenisKelamin; 
    private int usia;

    public Dosen01(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public void tampilData() {
        String jk = jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println("Kode Dosen   : " + kode);
        System.out.println("Nama Dosen   : " + nama);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("Usia Dosen   : " + usia);
        System.out.println("------------------------");
    }
}

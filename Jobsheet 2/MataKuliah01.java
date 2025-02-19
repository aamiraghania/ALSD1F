public class MataKuliah01 {
    private String kodeMK;
    private String nama;
    private int sks;
    private int jumlahJam;

    public MataKuliah01() {
        this.kodeMK = "Tidak Diketahui";
        this.nama = "Tidak Diketahui";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public MataKuliah01(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam + " jam per minggu");
    }

    public void ubahSKS(int sksBaru) {
        if (sksBaru > 0) {
            this.sks = sksBaru;
            System.out.println("SKS berhasil diubah menjadi: " + sksBaru);
        } else {
            System.out.println("Nilai SKS tidak valid.");
        }
    }

    public void tambahJam(int jam) {
        if (jam > 0) {
            this.jumlahJam += jam;
            System.out.println(jam + " jam berhasil ditambahkan. Jumlah jam saat ini: " + jumlahJam);
        } else {
            System.out.println("Penambahan jam tidak valid.");
        }
    }

    public void kurangiJam(int jam) {
        if (jam > 0 && jam <= jumlahJam) {
            this.jumlahJam -= jam;
            System.out.println(jam + " jam berhasil dikurangi. Jumlah jam saat ini: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi atau nilai jam tidak valid.");
        }
    }
}

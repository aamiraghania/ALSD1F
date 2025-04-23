public class Dosen {
    private String nidn;
    private String nama;
    private String email;
    private int tahunMasuk;
    private String prodi;
    private int masaKerja;

    public Dosen(String nidn, String nama, String email, int tahunMasuk, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.email = email;
        this.tahunMasuk = tahunMasuk;
        this.prodi = prodi;
        this.masaKerja = 2025 - tahunMasuk;
    }

    public String getNidn() {
        return nidn;
    }

    public String getNama() {
        return nama;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void tampilkanData() {
        System.out.println("NIDN         : " + nidn);
        System.out.println("Nama         : " + nama);
        System.out.println("Email        : " + email);
        System.out.println("Program Studi: " + prodi);
        System.out.println("Tahun Masuk  : " + tahunMasuk);
        System.out.println("Masa Kerja   : " + masaKerja + " tahun");
        System.out.println("-------------------------------");
    }
}

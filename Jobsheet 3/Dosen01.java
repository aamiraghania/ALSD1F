import java.util.Scanner;

public class Dosen01 {
    public String kode;
    public String nama;
    public boolean jenisKelamin; 
    public int usia;

    public Dosen01() {
    }

    public Dosen01(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void inputData(Scanner sc) {
        System.out.print("Kode          : ");
        this.kode = sc.nextLine();
        System.out.print("Nama          : ");
        this.nama = sc.nextLine();
        System.out.print("Jenis Kelamin : ");
        String jk = sc.nextLine();
        this.jenisKelamin = jk.equalsIgnoreCase("Pria");
        System.out.print("Usia          : ");
        this.usia = Integer.parseInt(sc.nextLine());
        System.out.println("----------------------------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia         : " + usia);
        System.out.println("----------------------------------------");
    }
}

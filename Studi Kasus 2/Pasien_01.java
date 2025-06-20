public class Pasien_01{
    String nama;
    String nik;
    String keluhan;
    String kodeAntrian; //penambahan

    public Pasien_01(String nama, String nik,String keluhan, String kodeAntrian){
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
        this.kodeAntrian = kodeAntrian; //penambahan
    }
    public void tampilkanInformasi(){
        System.out.println("Kode Antrian :" + this.kodeAntrian);
        System.out.println("Nama : " + this.nama);
        System.out.println("NIK : " + this.nik);
        System.out.println("Keluhan : " + this.keluhan);
    }
}
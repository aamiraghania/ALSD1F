public class DosenMain01 {
    public static void main(String[] args) {
        Dosen01 dosen1 = new Dosen01();
      
        Dosen01 dosen2 = new Dosen01("D001", "Dr. Siti", true, 2010, "Matematika Terapan");

        System.out.println("Informasi Dosen 1:");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(true); 
        System.out.println("Masa kerja Dosen 1: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.ubahKeahlian("Statistika"); 

        System.out.println("\nInformasi Dosen 2:");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(false); 
        System.out.println("Masa kerja Dosen 2: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.ubahKeahlian("Komputasi Matematika"); 
}
}


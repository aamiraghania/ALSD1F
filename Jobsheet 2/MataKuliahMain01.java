public class MataKuliahMain01 {
    public static void main(String[] args) {
        
        MataKuliah01 mk1 = new MataKuliah01();
    
        MataKuliah01 mk2 = new MataKuliah01("MK001", "Algoritma dan Struktur Data", 3, 5);

        System.out.println("Informasi Mata Kuliah 1 (Konstruktor Default):");
        mk1.tampilInformasi();

        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
      
        System.out.println("\nInformasi Mata Kuliah 2 (Konstruktor Berparameter):");
        mk2.tampilInformasi();
       
        mk2.ubahSKS(6);
        mk2.tambahJam(3);
        mk2.kurangiJam(2);
    }
}

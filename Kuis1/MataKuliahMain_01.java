public class MataKuliahMain_01 {
    public static void main(String[] args) {

        MataKuliah_01 mk1 = new MataKuliah_01("MK101", "Algoritma dan Struktur Data", 3);
        MataKuliah_01 mk2 = new MataKuliah_01("MK102", "Basis Data", 4);

        mk1.tampilkanInfo();
        mk2.tampilkanInfo();

        mk1.ubahNamaMK("Matematika Lanjut");
        mk1.tampilkanInfo();

        mk2.ubahSKS(5);
        mk2.tampilkanInfo();

        mk2.ubahSKS(1);
        mk2.tampilkanInfo();
    }
}


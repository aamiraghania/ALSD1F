public class MataKuliah_01 {
    
     String kodeMK;
     String namaMK;
     int sks;

    public MataKuliah_01(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        setSks(sks); 
    }

    public void tampilkanInfo() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println();
    }

    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }

    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
        } else {
            System.out.println("Jumlah SKS harus minimal 2.");
            System.out.println();
        }
    }

    private void setSks(int sks) {
        if (sks >= 2) {
            this.sks = sks;
        } else {
            System.out.println("Jumlah SKS harus minimal 2.");
            this.sks = 2; 
        }
    }

    public int getSks() {
        return sks;
    }
}

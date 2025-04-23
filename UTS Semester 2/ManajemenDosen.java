public class ManajemenDosen {
    Dosen[] dataDosen;
    int jumlahDosen;

    public ManajemenDosen() {
        dataDosen = new Dosen[] {
            new Dosen("0002", "Ani", "ani@polinema.ac.id", 2010, "Teknik Informatika"),
            new Dosen("0004", "Budi", "budi@polinema.ac.id", 2015, "Teknik Mesin"),
            new Dosen("0001", "Clara", "clara@polinema.ac.id", 2005, "Teknik Sipil"),
            new Dosen("0005", "Didi", "didi@polinema.ac.id", 2012, "Akuntansi"),
            new Dosen("0003", "Lina", "lina@polinema.ac.id", 2014, "Sistem Informasi Bisnis")
        };
        jumlahDosen = dataDosen.length;
    }

    public void tampilkanSemuaDosen() {
        if (jumlahDosen == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i = 0; i < jumlahDosen; i++) {
            dataDosen[i].tampilkanData();
        }
    }

    public void urutkanNIDN() {
        // Bubble Sort (ascending by NIDN)
        for (int i = 0; i < jumlahDosen - 1; i++) {
            for (int j = 0; j < jumlahDosen - i - 1; j++) {
                if (dataDosen[j].getNidn().compareTo(dataDosen[j + 1].getNidn()) > 0) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data dosen diurutkan berdasarkan NIDN (Ascending):");
        tampilkanSemuaDosen();
    }

    public void cariNama(String keyword) {
        // Linear Search
        boolean ditemukan = false;
        for (int i = 0; i < jumlahDosen; i++) {
            if (dataDosen[i].getNama().equalsIgnoreCase(keyword)) {
                dataDosen[i].tampilkanData();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen tidak ditemukan.");
        }
    }

    public void urutkanMasaKerja() {
        // Selection Sort (descending by masa kerja)
        for (int i = 0; i < jumlahDosen - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < jumlahDosen; j++) {
                if (dataDosen[j].getMasaKerja() > dataDosen[maxIdx].getMasaKerja()) {
                    maxIdx = j;
                }
            }
            Dosen temp = dataDosen[i];
            dataDosen[i] = dataDosen[maxIdx];
            dataDosen[maxIdx] = temp;
        }
        System.out.println("Data dosen diurutkan berdasarkan Masa Kerja (Descending):");
        tampilkanSemuaDosen();
    }
}
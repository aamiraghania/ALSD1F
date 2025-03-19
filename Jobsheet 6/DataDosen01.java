import java.util.ArrayList;

public class DataDosen01 {
    private ArrayList<Dosen01> listDosen;

    public DataDosen01() {
        listDosen = new ArrayList<>();
    }

    public void tambah(Dosen01 dsn) {
        listDosen.add(dsn);
    }

    public void tampil() {
        if (listDosen.isEmpty()) {
            System.out.println("Tidak ada data dosen yang tersedia.");
        } else {
            for (Dosen01 dsn : listDosen) {
                dsn.tampilData();
            }
        }
    }

    public void sortingASC() {
        int n = listDosen.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listDosen.get(j).getUsia() > listDosen.get(j + 1).getUsia()) {
                    Dosen01 temp = listDosen.get(j);
                    listDosen.set(j, listDosen.get(j + 1));
                    listDosen.set(j + 1, temp);
                }
            }
        }
        System.out.println("Data dosen setelah diurutkan secara ASC (termuda -> tertua):");
        tampil();
    }

    public void sortingDSC() {
        int n = listDosen.size();
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (listDosen.get(j).getUsia() > listDosen.get(maxIndex).getUsia()) {
                    maxIndex = j;
                }
            }
            
            Dosen01 temp = listDosen.get(i);
            listDosen.set(i, listDosen.get(maxIndex));
            listDosen.set(maxIndex, temp);
        }
        System.out.println("Data dosen setelah diurutkan secara DSC (tertuat -> termuda):");
        tampil();
    }
}

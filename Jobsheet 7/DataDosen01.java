import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        Collections.sort(listDosen, Comparator.comparingInt(Dosen01::getUsia));
        System.out.println("Data dosen setelah diurutkan secara ASC (termuda -> tertua):");
        tampil();
    }

    public void sortingDSC() {
        Collections.sort(listDosen, (a, b) -> b.getUsia() - a.getUsia());
        System.out.println("Data dosen setelah diurutkan secara DSC (tertua -> termuda):");
        tampil();
    }

    // Pencarian data secara sequential berdasarkan nama
    public void pencarianDataSequential(String namaCari) {
        boolean ditemukan = false;
        int count = 0;

        System.out.println("Hasil pencarian data dosen berdasarkan nama:");
        for (Dosen01 dsn : listDosen) {
            if (dsn.getNama().equalsIgnoreCase(namaCari)) {
                dsn.tampilData();
                ditemukan = true;
                count++;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dosen dengan nama " + namaCari + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu hasil dengan nama " + namaCari + ".");
        }
    }

    // Pencarian data secara binary search berdasarkan usia
    public void pencarianDataBinary(int usiaCari) {
        Collections.sort(listDosen, Comparator.comparingInt(Dosen01::getUsia));

        int left = 0;
        int right = listDosen.size() - 1;
        boolean ditemukan = false;
        int count = 0;

        System.out.println("Hasil pencarian data dosen berdasarkan usia:");
        while (left <= right) {
            int mid = (left + right) / 2;
            if (listDosen.get(mid).getUsia() == usiaCari) {
                for (Dosen01 dsn : listDosen) {
                    if (dsn.getUsia() == usiaCari) {
                        dsn.tampilData();
                        ditemukan = true;
                        count++;
                    }
                }
                break;
            } else if (listDosen.get(mid).getUsia() < usiaCari) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dosen dengan usia " + usiaCari + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu hasil dengan usia " + usiaCari + ".");
        }
    }
}

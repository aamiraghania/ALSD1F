public class fungsi01 {
    // Data stok bunga di setiap cabang (baris = cabang, kolom = jenis bunga)
    static int[][] stokBunga = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };

    // Harga setiap jenis bunga
    static int[] hargaBunga = {75000, 50000, 60000, 10000}; // {Aglonema, Keladi, Alocasia, Mawar}

    // Pengurangan stok bunga mati pada RoyalGarden 4
    static int[] bungaMati = {-1, -2, 0, -5}; // {Aglonema, Keladi, Alocasia, Mawar}

    public static void main(String[] args) {
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual:");
        hitungPendapatan();

        System.out.println("\nStok RoyalGarden 4 Sebelum Pengurangan:");
        tampilkanStokCabang(3); // RoyalGarden 4 ada di indeks ke-3

        System.out.println("\nStok RoyalGarden 4 Setelah Pengurangan Bunga Mati:");
        updateStokBungaMati(3);
        tampilkanStokCabang(3);
    }

    // Fungsi untuk menghitung pendapatan setiap cabang jika semua bunga terjual
    public static void hitungPendapatan() {
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatan += stokBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }

    // Fungsi untuk menampilkan stok bunga di cabang tertentu
    public static void tampilkanStokCabang(int cabangIndex) {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < stokBunga[cabangIndex].length; i++) {
            System.out.println(namaBunga[i] + ": " + stokBunga[cabangIndex][i]);
        }
    }

    // Fungsi untuk memperbarui stok bunga di RoyalGarden 4 setelah ada bunga mati
    public static void updateStokBungaMati(int cabangIndex) {
        for (int i = 0; i < stokBunga[cabangIndex].length; i++) {
            stokBunga[cabangIndex][i] += bungaMati[i]; // Update stok
            if (stokBunga[cabangIndex][i] < 0) stokBunga[cabangIndex][i] = 0; // Pastikan stok tidak negatif
        }
    }
}

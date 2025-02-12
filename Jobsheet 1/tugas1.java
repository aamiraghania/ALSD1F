import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        // Array KODE (Kode plat mobil)
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        // Array KOTA (Nama kota)
        String[] KOTA = {
            "BANTEN", 
            "JAKARTA", 
            "BANDUNG", 
            "CIREBON", 
            "BOGOR",
            "PEKALONGAN", 
            "SEMARANG", 
            "SURABAYA",
            "MALANG", 
            "TEGAL"
        };
        
        // Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = scanner.next().toUpperCase().charAt(0);
        
        // Mencari kota berdasarkan kode plat
        boolean found = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                System.out.println("Nama kota: " + KOTA[i]);
                found = true;
                break;
            }
        }
        
        // Jika tidak ditemukan
        if (!found) {
            System.out.println("Kode plat tidak ditemukan.");
        }
        
        scanner.close();
    }
}

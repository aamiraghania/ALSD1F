public class soalNo1 {
    class Mahasiswa {
        String nim;
        String nama;
        String kelas;
        float ipk;

        Mahasiswa() {
            this.nim = "Unknown";
            this.nama = "Unknown";
            this.kelas = "Unknown";
            this.ipk = 0.0f;
        }

        Mahasiswa(String nim, String nama) {
            this.nim = nim;
            this.nama = nama;
            this.kelas = "Unknown";
            this.ipk = 0.0f;
        }

        Mahasiswa(String nim, String nama, String kelas, float ipk) {
            this.nim = nim;
            this.nama = nama;
            this.kelas = kelas;
            this.ipk = ipk;
        }
    }

    public static void main(String[] args) {
        soalNo1 outer = new soalNo1();

        Mahasiswa m1 = outer.new Mahasiswa();
        Mahasiswa m2 = outer.new Mahasiswa("244107060033", "Agnes");
        Mahasiswa m3 = outer.new Mahasiswa("244107060033", "Agnes", "SIB-1E", 3.75f);

        System.out.println("Mahasiswa 1: " + m1.nama + ", NIM: " + m1.nim);
        System.out.println("Mahasiswa 2: " + m2.nama + ", NIM: " + m2.nim);
        System.out.println("Mahasiswa 3: " + m3.nama + ", NIM: " + m3.nim + ", Kelas: " + m3.kelas + ", IPK: " + m3.ipk);
    }
}

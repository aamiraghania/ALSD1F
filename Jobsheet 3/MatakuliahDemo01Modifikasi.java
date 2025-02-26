import java.util.Scanner;
public class MatakuliahDemo01Modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matakuliah yang ingin ditambahkan: ");
        int jumlahMatakuliah = sc.nextInt();
        sc.nextLine();

        Matakuliah01[] arrayOfMatakuliah = new Matakuliah01[jumlahMatakuliah];

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = Matakuliah01.tambahData();
        }

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}


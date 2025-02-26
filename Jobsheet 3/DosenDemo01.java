import java.util.Scanner;
public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen01[] arrayOfDosen01 = new Dosen01[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            arrayOfDosen01[i] = new Dosen01();
            arrayOfDosen01[i].inputData(sc);;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDosen01[i].cetakInfo();
        }

         System.out.println("\nData Semua Dosen:");
         DataDosen01.dataSemuaDosen01(arrayOfDosen01);
        
         DataDosen01.jumlahDosenPerJenisKelamin01(arrayOfDosen01);
        
         DataDosen01.rerataUsiaDosenPerJenisKelamin01(arrayOfDosen01);
 
         DataDosen01.infoDosenPalingTua01(arrayOfDosen01);

         DataDosen01.infoDosenPalingMuda01(arrayOfDosen01);
    }    
}
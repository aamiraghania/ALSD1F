public class DataDosen01 {
    public static void dataSemuaDosen01(Dosen01[] arrayOfDosen) {
        for (Dosen01 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin01(Dosen01[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen01 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin01(Dosen01[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen01 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria   : " + (countPria > 0 ? (totalUsiaPria / countPria) : 0));
        System.out.println("Rata-rata Usia Dosen Wanita : " + (countWanita > 0 ? (totalUsiaWanita / countWanita) : 0));
    }

    public static void infoDosenPalingTua01(Dosen01[] arrayOfDosen) {
        Dosen01 tertua = arrayOfDosen[0];
        for (Dosen01 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tertua.cetakInfo();
    }

    public static void infoDosenPalingMuda01(Dosen01[] arrayOfDosen) {
        Dosen01 termuda = arrayOfDosen[0];
        for (Dosen01 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.cetakInfo();
    }
}

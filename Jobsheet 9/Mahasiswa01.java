public class Mahasiswa01 {
String nama, nim, kelas;
double nilai;

Mahasiswa01(String nama, String nim, String kelas) {
    this.nama = nama;
    this.nim = nim;
    this.kelas = kelas;
    nilai = -1;
}

void tugasDinilai(int nilai) {
    this.nilai = nilai;
}

public String infoMahasiswa() {
    return nama;
}
}
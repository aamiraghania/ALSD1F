public class AntrianPasien_01 {
    nodePasien_01 head, tail; 
    int size; 

    public AntrianPasien_01() {
        head = tail = null;
        size = 0;
    }

    public void tambahPasien(Pasien_01 p) { //modifikasi 
    nodePasien_01 baru = new nodePasien_01(p);

    String keluhan = p.keluhan.toLowerCase();
    boolean gawatDarurat = keluhan.contains("darurat") || keluhan.contains("kritis") || keluhan.contains("parah");

    if (isEmpty()) {
        head = tail = baru;
    } else if (gawatDarurat) {
        baru.next = head;
        head = baru;
    } else {
        tail.next = baru;
        tail = baru;
    }

    size++;
    }

    public Pasien_01 layaniPasien() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Pasien_01 p = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return p;
    }

    public void tampilkanAntrian() {//print
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Daftar Antrian Pasien:");
        nodePasien_01 current = head;
        while (current != null) {
            System.out.println();
            System.out.println("Kode Antrian: " + current.data.kodeAntrian);
            System.out.println("Nama Pasien: " + current.data.nama);
            System.out.println("NIK: " + current.data.nik);
            System.out.println("Keluhan: " + current.data.keluhan);
            current = current.next;
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
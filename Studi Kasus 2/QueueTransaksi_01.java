public class QueueTransaksi_01 {
    TransaksiLayanan_01[] queue;
    int front, rear, size, capacity;

    public QueueTransaksi_01(int kapasitas) {
        capacity = kapasitas;
        queue = new TransaksiLayanan_01[kapasitas];
        front = size = 0;
        rear = -1;
    }

    public void enqueue(TransaksiLayanan_01 t) {
        if (isFull()) {
            System.out.println("Riwayat transaksi penuh! Tidak dapat menambahkan transaksi lagi.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = t;
        size++;
        System.out.println("Transaksi berhasil ditambahkan.");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void tampilkanRiwayat() {
        if (isEmpty()) {
            System.out.println("Belum ada transaksi layanan.");
            return;
        }
        System.out.println("Riwayat Transaksi Layanan:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % capacity;
            queue[idx].tampilkanTransaksi();
        }
    }

    public int getJumlahTransaksi() {
        return size;
    }

    public double hitungRataRataDurasi() {
    if (isEmpty()) {
        return 0;
    }
    double totalDurasi = 0;
    for (int i = 0; i < size; i++) {
        int idx = (front + i) % capacity;
        totalDurasi += queue[idx].durasiLayanan;
    }
    return totalDurasi / size;
}

}
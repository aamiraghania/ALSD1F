public class QueueAntrian01 {
    Node01 front, rear;
    int size = 0;
    final int MAX = 10;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= MAX;
    }

    public void enqueue(MahasiswaSoal01 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        Node01 baru = new Node01(mhs);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.print("Memanggil antrian: ");
        front.data.tampil();
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian paling akhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Isi antrian:");
        Node01 current = front;
        int no = 1;
        while (current != null) {
            System.out.print(no++ + ". ");
            current.data.tampil();
            current = current.next;
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
}

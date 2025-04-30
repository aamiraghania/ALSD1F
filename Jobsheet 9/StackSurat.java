public class StackSurat {
    int maxSize = 100;
    Surat[] tumpukan;
    int top;

    public StackSurat() {
        tumpukan = new Surat[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(Surat surat) {
        if (isFull()) {
            System.out.println("Stack surat penuh.");
        } else {
            tumpukan[++top] = surat;
            System.out.println("Surat berhasil ditambahkan.");
        }
    }

    public Surat pop() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        } else {
            return tumpukan[top--];
        }
    }

    public Surat peek() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat.");
            return null;
        } else {
            return tumpukan[top];
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                tumpukan[i].tampilkanSurat();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}

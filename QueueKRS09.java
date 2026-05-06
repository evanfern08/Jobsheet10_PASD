class QueueKRS09 {
    MahasiswaKRS09[] data;
    int front, rear, size, max;
    int jumlahProses = 0;

    public QueueKRS09(int n) {
        max = n;
        data = new MahasiswaKRS09[max];
        front = rear = -1;
        size = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void tambahAntrian(MahasiswaKRS09 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (IsEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
    }

    // proses 2 mahasiswa
    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }

        System.out.println("Mahasiswa diproses:");
        data[front].tampil();
        front = (front + 1) % max;
        size--;

        data[front].tampil();
        front = (front + 1) % max;
        size--;

        jumlahProses += 2;
    }

    public void tampilSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        int i = front;
        for (int j = 0; j < size; j++) {
            data[i].tampil();
            i = (i + 1) % max;
        }
    }

    public void tampilDepan() {
        if (size >= 2) {
            System.out.println("2 Antrian Terdepan:");
            data[front].tampil();
            data[(front + 1) % max].tampil();
        } else {
            System.out.println("Antrian kurang dari 2");
        }
    }

    public void lihatAkhir() {
        if (!IsEmpty()) {
            System.out.println("Antrian terakhir:");
            data[rear].tampil();
        }
    }

    public void info() {
        System.out.println("Jumlah antrian: " + size);
        System.out.println("Sudah proses: " + jumlahProses);
        System.out.println("Belum proses: " + (30 - jumlahProses));
    }
}
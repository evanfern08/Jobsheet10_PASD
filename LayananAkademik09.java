class LayananAkademik09 {
    Mahasiswa09[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahDilayani = 0;

    public LayananAkademik09(int n) {
        max = n;
        data = new Mahasiswa09[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    // tambah antrian layanan
    public void tambahAntrian(Mahasiswa09 mhs) {
        if (IsFull()) {
            System.out.println("Antrian layanan penuh!");
            return;
        }
        if (IsEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa masuk antrian layanan");
    }

    // melayani 2 mahasiswa
    public void layani() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }

        System.out.println("Mahasiswa dilayani:");
        data[front].tampil();
        front = (front + 1) % max;
        size--;

        data[front].tampil();
        front = (front + 1) % max;
        size--;

        jumlahDilayani += 2;
    }

    // tampil semua antrian
    public void tampil() {
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

    // tampil depan
    public void lihatDepan() {
        if (!IsEmpty()) {
            data[front].tampil();
        }
    }

    // tampil belakang
    public void lihatBelakang() {
        if (!IsEmpty()) {
            data[rear].tampil();
        }
    }

    // info antrian
    public void info() {
        System.out.println("Jumlah antrian: " + size);
        System.out.println("Sudah dilayani: " + jumlahDilayani);
        System.out.println("Belum dilayani: " + (30 - jumlahDilayani));
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }
}
class Queue09 {
    Mahasiswa09[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahProses = 0;

    public Queue09(int n) {
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

    public void Enqueue(Mahasiswa09 dt) {
        if (IsFull()) {
            System.out.println("Queue penuh!");
            return;
        }
        if (IsEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = dt;
        size++;
    }

    public void Dequeue() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }

        System.out.println("Diproses:");
        data[front].tampil();
        front = (front + 1) % max;
        size--;

        data[front].tampil();
        front = (front + 1) % max;
        size--;

        jumlahProses += 2;
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue kosong");
            return;
        }
        int i = front;
        for (int j = 0; j < size; j++) {
            data[i].tampil();
            i = (i + 1) % max;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            data[front].tampil();
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            data[rear].tampil();
        }
    }

    public void peek2() {
        if (size < 2) {
            System.out.println("Data kurang dari 2");
            return;
        }
        data[front].tampil();
        data[(front + 1) % max].tampil();
    }

    public int getJumlah() {
        return size;
    }

    public int getSudahProses() {
        return jumlahProses;
    }

    public int getBelumProses() {
        return 30 - jumlahProses;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Queue dikosongkan");
    }
}
import java.util.Scanner;

public class QueueMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue09 Q = new Queue09(10);

        int pilih;
        do {
            System.out.println("\n=== MENU QUEUE KRS ===");
            System.out.println("1. Enqueue (Tambah Antrian)");
            System.out.println("2. Dequeue (Proses 2 Mahasiswa)");
            System.out.println("3. Print (Tampil Semua)");
            System.out.println("4. Peek (Lihat Depan)");
            System.out.println("5. Peek Rear (Lihat Belakang)");
            System.out.println("6. Peek 2 (Lihat 2 Terdepan)");
            System.out.println("7. Info Antrian");
            System.out.println("8. Clear");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa09 mhs = new Mahasiswa09(nim, nama, prodi, kelas);
                    Q.Enqueue(mhs);
                    break;

                case 2:
                    Q.Dequeue();
                    break;

                case 3:
                    Q.print();
                    break;

                case 4:
                    Q.peek();
                    break;

                case 5:
                    Q.peekRear();
                    break;

                case 6:
                    Q.peek2();
                    break;

                case 7:
                    System.out.println("Jumlah antrian : " + Q.getJumlah());
                    System.out.println("Sudah diproses : " + Q.getSudahProses());
                    System.out.println("Belum diproses : " + Q.getBelumProses());
                    break;

                case 8:
                    Q.clear();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);

        sc.close();
    }
}
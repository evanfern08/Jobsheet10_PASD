import java.util.Scanner;

public class LayananAkademikMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LayananAkademik09 antrian = new LayananAkademik09(10);

        int pilih;
        do {
            System.out.println("\n=== SISTEM LAYANAN AKADEMIK (SIAKAD) ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat Antrian Depan");
            System.out.println("5. Lihat Antrian Belakang");
            System.out.println("6. Info Antrian");
            System.out.println("7. Kosongkan Antrian");
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
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.layani();
                    break;

                case 3:
                    antrian.tampil();
                    break;

                case 4:
                    antrian.lihatDepan();
                    break;

                case 5:
                    antrian.lihatBelakang();
                    break;

                case 6:
                    antrian.info();
                    break;

                case 7:
                    antrian.clear();
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
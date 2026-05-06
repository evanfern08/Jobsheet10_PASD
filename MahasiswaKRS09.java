class MahasiswaKRS09 {
    String nim, nama, prodi, kelas;

    public MahasiswaKRS09(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampil() {
        System.out.println(nim + " | " + nama + " | " + prodi + " | " + kelas);
    }
}
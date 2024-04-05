public class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;
    private double nilai;

    public Mahasiswa(String nim, String nama, String kelas, double nilai) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = nilai;
    }
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim='" + nim + '\'' + ", nama='" + nama + '\'' + ", kelas='" + kelas + '\'' + ", nilai=" + nilai + '}';
    }
} 

import java.util.HashMap;
import java.util.Map;

public class MahasiswaMap {
    private Map<String, Mahasiswa> mahasiswaMap;

    public MahasiswaMap() {
        mahasiswaMap = new HashMap<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaMap.put(mahasiswa.getNim() + mahasiswa.getKelas(), mahasiswa);
    }

    public void hapusMahasiswa(String nim, String kelas) {
        mahasiswaMap.remove(nim + kelas);
    }

    public void simpanNilaiMahasiswa(String nim, String kelas, double nilai) {
        Mahasiswa mahasiswa = mahasiswaMap.get(nim + kelas);
        if (mahasiswa != null) {
            mahasiswa.setNilai(nilai);
            mahasiswaMap.put(nim + kelas, mahasiswa);
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }

    public void tampilkanNilaiMahasiswa() {
        double totalNilai = 0;
        int jumlahMahasiswa = 0;
        for (Mahasiswa mahasiswa : mahasiswaMap.values()) {
            System.out.println(mahasiswa);
            totalNilai += mahasiswa.getNilai();
            jumlahMahasiswa++;
        }
        double rataRata = totalNilai / jumlahMahasiswa;
        System.out.println("Rata-rata nilai keseluruhan: " + rataRata);
    }
}

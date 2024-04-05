// Asumsi program java hashing maping
// 1. Setiap Mahasiswa sendiri memiliki data dari key yang disimpan seperti Nama Mahasiswa, NIM, dan Kelas.
// 2. Setiap kelas memiliki nama yang unik.
// 3. NIM Mahasiswa itu unik. Jadi tidak semua NIM mahasiswa itu sama.
// 4. Setiap Map menggunakan tiga kelas yaitu kelas HashMap, LinkedHashMap, TreeMap.
// 5. Program akan menggunakan NIM dan kelas sebagai kunci untuk menyimpan data mahasiswa dalam peta (map)


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MahasiswaMap mahasiswaMap = new MahasiswaMap();
        Scanner sc = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Simpan Nilai Mahasiswa");
            System.out.println("4. Tampilkan Nilai Mahasiswa dan Rata-rata");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.next();
                    System.out.print("Nama: ");
                    String kelas = sc.next();
                    sc.nextLine();
                    System.out.print("Kelas: ");
                    String nama = sc.nextLine();
                    mahasiswaMap.tambahMahasiswa(new Mahasiswa(nim, kelas, nama, 0));
                    break;
                case 2:
                    System.out.print("NIM: ");
                    nim = sc.next();
                    System.out.print("Kelas: ");
                    kelas = sc.next();
                    mahasiswaMap.hapusMahasiswa(nim, kelas);
                    break;
                case 3:
                    System.out.print("NIM: ");
                    nim = sc.next();
                    System.out.print("Kelas: ");
                    kelas = sc.next();
                    System.out.print("Nilai: ");
                    double nilai = sc.nextDouble();
                    mahasiswaMap.simpanNilaiMahasiswa(nim, kelas, nilai);
                    break;
                case 4:
                    mahasiswaMap.tampilkanNilaiMahasiswa();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}

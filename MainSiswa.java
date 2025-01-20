import java.util.Scanner;



public class MainSiswa {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Siswa
        System.out.print("Masukkan nama siswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan usia siswa: ");
        int usia = scanner.nextInt();
        System.out.print("Masukkan nilai siswa: ");
        double nilai = scanner.nextDouble();

        Siswa n = new Siswa ();
        n.setNama(nama);
        n.setUsia(usia);
        n.setNilai(nilai);
        
        // Menampilkan informasi siswa
        System.out.println("\nInformasi Siswa");
        
        System.out.println("Nama: " + n.getNama());
        
        System.out.println("Usia: " + n.getUsia());
        
        System.out.println("Nilai: " + n.getNilai());
        
    }
}
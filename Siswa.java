
public class Siswa {

    private String nama;
    private int usia;
    private double nilai;

    // Getter dan setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String namaIsi) {
        nama=namaIsi;
    }

    // Getter dan setter untuk usia dengan validasi
    public int getUsia() {
        return usia;
    }

    public void setUsia(int usiaIsi) {
        if (usia >= 0) {
            usia=usiaIsi;
        } else {
            System.out.println("Usia harus lebih dari 0.");
        }
    }

    // Getter dan setter untuk nilai dengan validasi
    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilaiIsi) {
        if (nilai >= 0 && nilai <= 100) {
            nilai=nilaiIsi;
        } else {
            System.out.println("Nilai harus antara 0 dan 100.");
        } 
    }
    
}
package traveloka.management;

public class Penerbangan {
    // Properties
    private String kodePenerbangan;
    private String tujuan;
    private double hargaTiket;
    
    // untuk menghitung jumlah penerbangan
    private static int totalPenerbangan = 0;

    // Constructor
    public Penerbangan(String kodePenerbangan, String tujuan, double hargaTiket) {
        this.kodePenerbangan = kodePenerbangan;
        this.tujuan = tujuan;
        this.hargaTiket = hargaTiket;
        totalPenerbangan++;
    }

    // Method untuk menampilkan informasi penerbangan
    public void tampilkanInfo() {
        System.out.println("Kode Penerbangan: " + kodePenerbangan + ", Tujuan: " + tujuan + ", Harga: " + hargaTiket);
    }

    // Getter dan Setter
    public String getKodePenerbangan() {
        return kodePenerbangan;
    }

    public void setKodePenerbangan(String kodePenerbangan) {
        this.kodePenerbangan = kodePenerbangan;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    // Static method untuk mendapatkan total penerbangan
    public static int getTotalPenerbangan() {
        return totalPenerbangan;
    }
}

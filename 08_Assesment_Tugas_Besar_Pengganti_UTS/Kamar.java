
import java.util.Date;

public class Kamar {

    private String jenisKamar;
    private int jumlahTamu;
    private int jumlahMalam;
    private double hargaPerMalam;
    private Date tanggalCheckin;
    private Date tanggalCheckout;

    private static final int BIAYA_TAMBAHAN_PER_TAMU = 100000;

    public Kamar(String jenisKamar, int jumlahTamu, int jumlahMalam, double hargaPerMalam, Date tanggalCheckin, Date tanggalCheckout) {
        if (jumlahTamu < 1 || jumlahMalam < 1 || hargaPerMalam <= 0) {
            throw new IllegalArgumentException("Input data kamar tidak valid.");
        }
        this.jenisKamar = jenisKamar;
        this.jumlahTamu = jumlahTamu;
        this.jumlahMalam = jumlahMalam;
        this.hargaPerMalam = hargaPerMalam;
        this.tanggalCheckin = tanggalCheckin;
        this.tanggalCheckout = tanggalCheckout;
    }

    public void printInformasi() {
        System.out.println("Jenis Kamar  : " + jenisKamar);
        System.out.println("Jumlah Tamu  : " + jumlahTamu);
        System.out.println("Jumlah Malam : " + jumlahMalam);
        System.out.println("Harga/Malam  : " + hargaPerMalam);
        System.out.println("Check-in     : " + tanggalCheckin);
        System.out.println("Check-out    : " + tanggalCheckout);
    }

    public double hitungTotalBiaya() {
        double total = hargaPerMalam * jumlahMalam;
        if (jumlahTamu > 2) {
            total += (jumlahTamu - 2) * BIAYA_TAMBAHAN_PER_TAMU;
        }
        return total;
    }
}

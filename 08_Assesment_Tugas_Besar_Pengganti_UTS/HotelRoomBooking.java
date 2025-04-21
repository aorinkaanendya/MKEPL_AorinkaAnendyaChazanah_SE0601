
import java.util.Date;

public class HotelRoomBooking {

    public static void main(String[] args) {
        // Membuat objek Pemesan
        Pemesan pemesan = new Pemesan("Aorinka Anendya Chazanah", "1234567890123456", "081234567890", "aorinka@gmail.com", "Wanita");

        // Membuat objek Kamar
        Kamar kamar = new Kamar("Deluxe", 3, 5, 500000, new Date(), new Date());

        // Membuat objek Pembayaran
        Pembayaran pembayaran = new Pembayaran("VOUCHER123", false, true);

        // Membuat objek Pemesanan dengan menggabungkan Pemesan, Kamar, dan Pembayaran
        Pemesanan pemesanan = new Pemesanan(pemesan, kamar, pembayaran);

        // Cetak detail pemesanan
        pemesanan.cetakDetailPemesanan();
    }
}

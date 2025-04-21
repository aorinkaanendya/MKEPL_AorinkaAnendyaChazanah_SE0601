
public class Pemesanan {

    private Pemesan pemesan;
    private Kamar kamar;
    private Pembayaran pembayaran;

    public Pemesanan(Pemesan pemesan, Kamar kamar, Pembayaran pembayaran) {
        this.pemesan = pemesan;
        this.kamar = kamar;
        this.pembayaran = pembayaran;
    }

    public void cetakDetailPemesanan() {
        printHeader();
        cetakInformasiPemesan();
        cetakInformasiKamar();
        cetakInformasiPembayaran();
        cetakTotalBiaya();
    }

    private void printHeader() {
        System.out.println("=== DETAIL PEMESANAN ===");
    }

    private void cetakInformasiPemesan() {
        pemesan.printInformasi();
    }

    private void cetakInformasiKamar() {
        kamar.printInformasi();
    }

    private void cetakInformasiPembayaran() {
        pembayaran.printInformasi();
    }

    private void cetakTotalBiaya() {
        System.out.println("Total Biaya  : Rp " + getTotalBiayaSetelahDiskon());
    }

    private double getTotalBiayaSetelahDiskon() {
        return pembayaran.hitungTotalBiaya(kamar.hitungTotalBiaya());
    }
}

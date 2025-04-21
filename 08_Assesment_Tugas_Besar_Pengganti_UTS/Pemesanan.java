
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
        pemesan.printInformasi();
        kamar.printInformasi();
        pembayaran.printInformasi();
        double totalBiaya = kamar.hitungTotalBiaya();
        totalBiaya = pembayaran.hitungTotalBiaya(totalBiaya);
        System.out.println("Total Biaya  : Rp " + totalBiaya);
    }
}

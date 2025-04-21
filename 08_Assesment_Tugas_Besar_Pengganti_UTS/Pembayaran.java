
public class Pembayaran {

    private String kodeVoucher;
    private boolean sudahDibayar;
    private boolean statusAktif;

    public Pembayaran(String kodeVoucher, boolean sudahDibayar, boolean statusAktif) {
        this.kodeVoucher = kodeVoucher;
        this.sudahDibayar = sudahDibayar;
        this.statusAktif = statusAktif;
    }

    public void printInformasi() {
        System.out.println("Voucher      : " + kodeVoucher);
        System.out.println("Sudah Dibayar: " + sudahDibayar);
        System.out.println("Status Aktif : " + statusAktif);
    }

    public double hitungTotalBiaya(double totalBiayaKamar) {
        double total = totalBiayaKamar;
        if (kodeVoucher != null && kodeVoucher.length() > 3) {
            total -= 50000;
        }
        if (!statusAktif) {
            total = 0;
        }
        return total;
    }
}

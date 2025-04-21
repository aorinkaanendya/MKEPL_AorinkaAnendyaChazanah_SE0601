
public class Pemesan {

    private String namaPemesan;
    private String nomorKTP;
    private String nomorTelepon;
    private String email;
    private String jenisKelamin;

    public Pemesan(String namaPemesan, String nomorKTP, String nomorTelepon, String email, String jenisKelamin) {
        this.namaPemesan = namaPemesan;
        this.nomorKTP = nomorKTP;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
    }

    public void printInformasi() {
        System.out.println("Nama Pemesan : " + namaPemesan);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("No. KTP      : " + nomorKTP);
        System.out.println("Telepon      : " + nomorTelepon);
        System.out.println("Email        : " + email);
    }
}

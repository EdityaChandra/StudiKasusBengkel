class Pelanggan {
    private String nama;
    private String alamat;
    private String noTelepon;

    public Pelanggan(String nama, String alamat, String noTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    public String getDetail() {
        return "Nama: " + nama + "\nAlamat: " + alamat + "\nNo Telepon: " + noTelepon;
    }
}
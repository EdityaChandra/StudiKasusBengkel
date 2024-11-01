class Servis {
    private String nama;
    private int biaya;

    public Servis(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public String getDetail() {
        return "Servis: " + nama + ", Biaya: " + biaya;
    }

    public int getBiaya() {
        return biaya;
    }
}
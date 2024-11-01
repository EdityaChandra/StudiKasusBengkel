class RiwayatServis {
    private Servis[] daftarServis;
    private int index;
    private Pelanggan pelanggan;

    public RiwayatServis(int kapasitas, Pelanggan pelanggan) {
        this.daftarServis = new Servis[kapasitas];
        this.index = 0;
        this.pelanggan = pelanggan;
    }

    public void tambahServis(Servis servis) {
        if (index < daftarServis.length) {
            daftarServis[index] = servis;
            index++;
        } else {
            System.out.println("Kapasitas riwayat servis penuh!");
        }
    }

    public String tampilkanRiwayat() {
        StringBuilder riwayat = new StringBuilder();
        riwayat.append("Detail Pelanggan:\n").append(pelanggan.getDetail()).append("\n\nRiwayat Servis:\n");
        for (int i = 0; i < index; i++) {
            riwayat.append(daftarServis[i].getDetail()).append("\n");
        }
        return riwayat.toString();
    }

    public int getTotalBiaya() {
        int total = 0;
        for (int i = 0; i < index; i++) {
            total += daftarServis[i].getBiaya();
        }
        return total;
    }

    public int getJumlahServis() {
        return index;
    }
}
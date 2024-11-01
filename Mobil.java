public class Mobil extends Kendaraan {
    private  String tipeKendaraan;

    public Mobil(String platNomer, String merek, int tahun, String tipeKendaraan) {
        super(platNomer, merek, tahun);
        this.tipeKendaraan = tipeKendaraan;
    }
   // Override
    public String info() {
        return "Mobil: " + getMerek() + " (" + getTahun() + ") - Plat: " + getPlatNomer() + ", Tipe: " + tipeKendaraan;
    }

}

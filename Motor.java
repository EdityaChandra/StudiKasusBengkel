public class Motor extends Kendaraan{
    private String tipeMotor;

    public Motor(String platNomer, String merek, int tahun, String tipeMotor) {
        super(platNomer, merek, tahun);
        this.tipeMotor = tipeMotor;
    }
   // @Override
    public String info() {
        return "Motor: " + getMerek() + " (" + getTahun() + ") - Plat: " + getPlatNomer() + ", Tipe: " + tipeMotor;
    }
}

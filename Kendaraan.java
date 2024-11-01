public class Kendaraan {
    private String platNomer;
    private String merek;
    private int tahun;

//contructor
    public Kendaraan(String platNomer, String merek, int tahun) {
        this.platNomer = platNomer;
        this.merek = merek;
        this.tahun = tahun;
    }
//Getter dan setter
    public String getPlatNomer() {
        return platNomer;
    }

    public void setPlatNomer(String platNomer) {
        this.platNomer = platNomer;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}

package Model.Class_User;

import Model.Class_Enum.*;

public class TiketBisnis extends Tiket {
    private int beratBagasi;
    private Afirmasi afirmasi;
    public TiketBisnis(int jarakTempuh, double harga, JenisTiket jenisTiket, int beratBagasi, Afirmasi afirmasi) {
        super(jarakTempuh, harga, jenisTiket);
        this.beratBagasi = beratBagasi;
        this.afirmasi = afirmasi;
    }
    public int getBeratBagasi() {
        return beratBagasi;
    }
    public void setBeratBagasi(int beratBagasi) {
        this.beratBagasi = beratBagasi;
    }
    public Afirmasi getAfirmasi() {
        return afirmasi;
    }
    public void setAfirmasi(Afirmasi afirmasi) {
        this.afirmasi = afirmasi;
    }

}

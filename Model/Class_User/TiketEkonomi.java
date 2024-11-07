package Model.Class_User;

import Model.Class_Enum.JenisTiket;

public class TiketEkonomi extends Tiket {
    private int beratBagasi;
    
    public TiketEkonomi(int jarakTempuh, double harga, JenisTiket jenisTiket, int beratBagasi) {
        super(jarakTempuh, harga, jenisTiket);
        this.beratBagasi = beratBagasi;
    }
    public int getBeratBagasi() {
        return beratBagasi;
    }
    public void setBeratBagasi(int beratBagasi) {
        this.beratBagasi = beratBagasi;
    }
}

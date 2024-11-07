package Model.Class_User;

import Model.Class_Enum.*;

public abstract class Tiket {
    private int jarakTempuh;
    private double harga;
    private JenisTiket jenisTiket;
    public Tiket(){
        
    }
    public Tiket(int jarakTempuh, double harga, JenisTiket jenisTiket) {
        this.jarakTempuh = jarakTempuh;
        this.harga = harga;
        this.jenisTiket = jenisTiket;
    }
    private double totalHarga;
    public int getJarakTempuh() {
        return jarakTempuh;
    }
    public void setJarakTempuh(int jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public JenisTiket getJenisTiket() {
        return jenisTiket;
    }
    public void setJenisTiket(JenisTiket jenisTiket) {
        this.jenisTiket = jenisTiket;
    }
    public double getTotalHarga() {
        return totalHarga;
    }
    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
}

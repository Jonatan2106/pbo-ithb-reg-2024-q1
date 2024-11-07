package Controller;

import Model.Class_Enum.*;
import java.util.ArrayList;
import Model.Class_User.*;

public class TiketController {
    public static double hitungBiaya(int jarakTempuh, Afirmasi afirmasi){
        double total = jarakTempuh * 15000;
        if(afirmasi == Afirmasi.SETUJU){
            total += total*0.1;
        } else {
            total += 0;
        }
        return total;
    }

    public static double hitungBiaya(int jarakTempuh, int beratBagasi, Afirmasi afirmasi){
        double total = jarakTempuh * 10000;
        if(beratBagasi > 5){
            total += beratBagasi * 2500;
        } else {
            total += 0;
        }

        if(afirmasi == Afirmasi.SETUJU){
            total += total*0.1;
        } else {
            total += 0;
        }
        return total;
    }

    public static double hitungBiaya(int jarakTempuh, int beratBagasi){
        double total = jarakTempuh * 7500;
        if(beratBagasi > 5){
            total += (beratBagasi * 1500) + 5000;
        } else {
            total += 5000;
        }
        return total;
    }

    public static Afirmasi getAfirmasi(int pilih){
        if(pilih == 1){
            return Afirmasi.SETUJU;
        } else {
            return Afirmasi.TIDAKSETUJU;
        }
    }

    public static JenisTiket getJenisTiket(int tiket){
        if(tiket == 1){
            return JenisTiket.EKONOMI;
        } else if (tiket == 2){
            return JenisTiket.BISNIS;
        } else {
            return JenisTiket.FIRSTCLASS;
        }
    }

    public static double getTotal(ArrayList<Tiket> listTiket){
        double total = 0;
        for(Tiket tiket : listTiket){
            total += total + tiket.getHarga();
        }
        return total;
    }
}

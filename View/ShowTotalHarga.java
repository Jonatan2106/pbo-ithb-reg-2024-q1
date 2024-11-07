package View;

import Controller.TiketController;
import Main.Main;

public class ShowTotalHarga {
    public ShowTotalHarga(){
        showTotal();
    }

    public void showTotal(){
        System.out.println("Harga Final : " + TiketController.getTotal(Main.listTiket));
    }
}

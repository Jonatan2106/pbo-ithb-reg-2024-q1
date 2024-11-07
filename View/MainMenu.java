package View;

import java.util.Scanner;
import Controller.TiketController;
import Main.Main;
import Model.Class_User.*;
import Model.Class_Enum.*;

public class MainMenu{
    public static Scanner scan = new Scanner(System.in);
    public MainMenu() {
        showMenu();
    }
    
    public void showMenu(){
        boolean jalan = true;
        while(jalan){
            do {
                System.out.print("Banyak tiket : ");
                int banyakTiket = Integer.parseInt(scan.nextLine());

                for (int i = 0; i < banyakTiket; i++) {
                    new ShowMenuTiket();
                    System.out.println("Masukkan tiket : ");
                    int tiket = Integer.parseInt(scan.nextLine());
                    System.out.println("Masukkan tiket : ");
                    int tipe = Integer.parseInt(scan.nextLine());
                
                    switch (tiket) {
                        case 1:
                            Main.listTiket.add(menuTiketEkonomi(TiketController.getJenisTiket(tiket), tipe));
                            break;
                        case 2:
                            Main.listTiket.add(menuTiketBisnis(TiketController.getJenisTiket(tiket), tipe));
                            break;
                        case 3:
                            Main.listTiket.add(menuFirstClass(null, tipe));
                            break;
                        default:
                            System.out.println("Pilihan tidak ada");
                            break;
                    }
                }
                new ShowTotalHarga();
            }
        }
    }

    public Tiket menuTiketEkonomi(JenisTiket tiket, int tipe){
        System.out.println("Berapa Jarak tempuh : ");
        int jarakTempuh = Integer.parseInt(scan.nextLine());
        System.out.println("Berapa berata bagasi : ");
        int berat = Integer.parseInt(scan.nextLine());

        Tiket tiket2 = new TiketEkonomi(jarakTempuh, 0, TiketController.getJenisTiket(tipe), berat);

        tiket2.setHarga(TiketController.hitungBiaya(jarakTempuh, berat));

        return tiket2;
    }

    public Tiket menuTiketBisnis(JenisTiket tiket, int tipe){
        System.out.println("Berapa Jarak tempuh : ");
        int jarakTempuh = Integer.parseInt(scan.nextLine());
        System.out.println("Berapa berata bagasi : ");
        int berat = Integer.parseInt(scan.nextLine());
        System.out.print("Pakai afirmasi ? (1. true/2. false)");
        int afirmasi = Integer.parseInt(scan.nextLine());

        Tiket tiket2 = new TiketBisnis(jarakTempuh, 0, TiketController.getJenisTiket(tipe), berat, TiketController.getAfirmasi(afirmasi));

        tiket2.setHarga(TiketController.hitungBiaya(jarakTempuh, berat, null));

        return tiket2;
    }

    public Tiket menuFirstClass(JenisTiket tiket, int tipe){
        System.out.println("Berapa Jarak tempuh : ");
        int jarakTempuh = Integer.parseInt(scan.nextLine());
        System.out.print("Pakai afirmasi ? (1. true/2. false)");
        int afirmasi = Integer.parseInt(scan.nextLine());

        Tiket tiket2 = new TiketFirstClass(jarakTempuh, getAfirmasi(afirmasi));

        tiket2.setHarga(TiketController.hitungBiaya(jarakTempuh, null));

        return tiket2;
    }
}

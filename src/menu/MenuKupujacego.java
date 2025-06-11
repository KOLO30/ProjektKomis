package menu;

import Dane.InputData;
import Dane.Odczyt;
import Dane.Usun;
import TypySamochodow.ListaSamochodow;

public class MenuKupujacego {
    InputData inputData = new InputData();
    Usun usun = new Usun();
    //utworzenie menu kupującego
    public void menuView(){
        Menu menu = new Menu();
        WyswietlSamochody wyswietlSamochody = new WyswietlSamochody();
        System.out.println("\nMenu kupującego \n" +
                "1. Oglądaj samochody\n" +
                "2. Kup samochód\n" +
                "3. Powrót\n"+
                "0. Wyjście");

        String a = inputData.InputString();
        switch (a){
            case "1":
                wyswietlSamochody.wyswietl();
                menuView();
                break;
            case "2":
                kup();
                break;
            case "3":
                menu.menuView();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Uważaj! Podałeś niepoprawne dane.");
                menuView();
                break;
        }
    }
    //menu kupowanie samochodu
    public void kup(){
        System.out.println("\nKupowanie samochodu. Wybierz typ samochodu:\n" +
                "1. Osobowy\n" +
                "2. Elektryczny\n" +
                "3. Dostawczy\n" +
                "4. Powrót\n" +
                "0. Wyjście\n");
        String b= inputData.InputString();
        String kupujacy = "kupujacy";
        switch (b){
            case "1":
            case "2":
            case "3":
                Odczyt.odczytPliku(b);
                System.out.println("Podaj id samochodu który chcesz kupić");
                int z = inputData.InputInt();
                usun.usunZPliku(b,z,kupujacy);
                menuView();
                break;
            case "4":
                return;
            case "0":
                System.exit(0);
            default:
                System.out.println("Uważaj! Podałeś niepoprawne dane.");
                break;
        }
    }
}

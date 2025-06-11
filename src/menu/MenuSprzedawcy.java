package menu;

import Dane.InputData;
import Dane.Odczyt;
import Dane.Usun;
import TypySamochodow.ListaSamochodow;

public class MenuSprzedawcy {
    InputData inputData = new InputData();
    ListaSamochodow listaSamochodow = new ListaSamochodow();
    WyswietlSamochody wyswietlSamochody = new WyswietlSamochody();
    Usun usun = new Usun();

    //wyswietlanie menu sprzedawcy
    public void menuView(){
        Menu menu = new Menu();
        System.out.println("\nMenu Sprzedawcy\n" +
                "1. Wyświetl samochody\n" +
                "2. Dodaj samochód\n" +
                "3. Usuń samochód\n" +
                "4. Powrót\n"+
                "0. Wyjście");
        String a = inputData.InputString();
        switch (a){
            case "1":
                wyswietlSamochody.wyswietl();
                menuView();
                break;
            case "2":
                dodajMenu();
                menuView();
                break;
            case "3":
                usunMenu();
                menuView();
                break;
            case "4":
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
    //menu dodające nowy samochód do pliku
    public void dodajMenu(){
        System.out.println("\nDodawanie samochodu. Wybierz typ samochodu:\n" +
                "1. Osobowy\n" +
                "2. Elektryczny\n" +
                "3. Dostawczy\n" +
                "4. Powrót\n"+
                "0. Wyjście\n");
        String b= inputData.InputString();
        switch (b){
            case "1":
            case "2":
            case "3":
                listaSamochodow.dodajAuto(b);
                break;
            case "4":
                return;
            case "0":
                System.exit(0);
            default:
                System.out.println("Uważaj! Podałeś niepoprawne dane.");
                dodajMenu();
                break;
        }
    }
    //menu usuwające dane o samochodzie z pliku
    public void usunMenu(){
        System.out.println("\nUsuwanie samochodu. Wybierz typ samochodu:\n" +
                "1. Osobowy\n" +
                "2. Elektryczny\n" +
                "3. Dostawczy\n" +
                "4. Powrót\n"+
                "0. Wyjście\n");
        String b= inputData.InputString();
        String sprzedwaca = "sprzedawca";
        switch (b){
            case "1":
            case "2":
            case "3":
                Odczyt.odczytPliku(b);
                System.out.println("Podaj id samochodu który chcesz usunąć");
                int z = inputData.InputInt();
                usun.usunZPliku(b,z,sprzedwaca);
                menuView();
            case "4":
                return;
            case "0":
                System.exit(0);
            default:
                System.out.println("Uważaj! Podałeś niepoprawne dane.");
                usunMenu();
                break;
        }
    }
}

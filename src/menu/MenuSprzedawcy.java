package menu;

import Dane.InputData;
import TypySamochodow.ListaSamochodow;

public class MenuSprzedawcy {
    InputData inputData = new InputData();
    ListaSamochodow listaSamochodow = new ListaSamochodow();
    public void menuView(){
        Menu menu = new Menu();
        System.out.println("Menu Sprzedawcy\n" +
                "1. Wyświetl samochody\n" +
                "2. Dodaj samochód\n" +
                "3. Usuń samochód\n" +
                "4. Powrót\n"+
                "0. Wyjście");
        int a = inputData.InputInt();
        switch (a){
            case 1:
                listaSamochodow.wyswietl();
                break;
            case 2:
                dodajMenu();
                break;
            case 3:
                break;
            case 4:
                menu.menuView();
                break;
            case 0:
                return;
            default:
                System.out.println("Uważaj! Podałeś niepoprawne dane.");
                menuView();
                break;
        }

    }
    public void dodajMenu(){
        System.out.println("Dodawanie samochodu. Wybierz typ samochodu:\n" +
                "1. Osobowy\n" +
                "2. Elektryczny\n" +
                "3. Dostawczy\n" +
                "4. Powrót\n" +
                "0. Wyjście");
        int b= inputData.InputInt();
        switch (b){
            case 1:
                listaSamochodow.dodajAuto();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                menuView();
                break;
            case 0:
                return;
            default:
                dodajMenu();
                break;
        }
    }
    public void usun(){

    }
}

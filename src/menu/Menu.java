package menu;

import Dane.InputData;

public class Menu {
    public void menuView() {

        InputData inputData = new InputData();
        MenuSprzedawcy menuSprzedawcy = new MenuSprzedawcy();
        MenuKupujacego menuKupujacego = new MenuKupujacego();

        //wyświetlanie menu
        System.out.println("Kim jesteś?\n1. Sprzedawcą\n2. Kupującym\n0. Wyjdź");
        String a = inputData.InputString();
        switch (a) {
            case "1":
                    menuSprzedawcy.menuView();
                    break;
                case "2":
                    menuKupujacego.menuView();
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Uważaj! Podałeś niepoprawne dane.");
                    menuView();
                    break;
            }
    }
}

package menu;

import Dane.InputData;

public class Menu {
    public void menuView() {

        InputData inputData = new InputData();
        MenuSprzedawcy menuSprzedawcy = new MenuSprzedawcy();
        MenuKupujacego menuKupujacego = new MenuKupujacego();

        System.out.println("Kim jesteś?\n1. Sprzedawcą\n2. Kupującym\n0. Wyjdź");
        int a = inputData.InputInt();
        switch (a) {
            case 1:
            menuSprzedawcy.menuView();
            break;
            case 2:
            menuKupujacego.menuView();
            break;
            case 0:
                return;
            default:
                System.out.println("Uważaj! Podałeś niepoprawne dane.");
                menuView();
                break;
        }
    }

}

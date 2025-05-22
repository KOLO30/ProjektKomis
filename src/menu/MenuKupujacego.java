package menu;

import Dane.InputData;

public class MenuKupujacego {
    public void menuView(){
        Menu menu = new Menu();
        System.out.println("Menu kupującego \n" +
                "1. Oglądaj samochody\n" +
                "2. Kup samochód\n" +
                "3. Powrót\n"+
                "0. Wyjście");
        InputData inputData = new InputData();
        int a = inputData.InputInt();
        switch (a){
            case 1:
                break;
            case 2:
                break;
            case 3:
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
    public void kup(){

    }
}

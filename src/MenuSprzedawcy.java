public class MenuSprzedawcy {
    public void menuView(){
        Menu menu = new Menu();
        ListaSamochodow listaSamochodow = new ListaSamochodow();
        System.out.println("Co chcesz zrobic? \n" +
                "1. Oglądać samochody\n" +
                "2. Dodać samochód\n" +
                "3. Usunąć samochód\n" +
                "4. Wyjść");
        InputData inputData = new InputData();
        int a = inputData.InputInt();
        switch (a){
            case 1:
                listaSamochodow.wyswietl();
                break;
            case 2:
                //listaSamochodow.dodajAuto();
                break;
            case 3:
                break;
            case 4:
                menu.menuView();
                break;
            default:
                System.out.println("Uważaj! Podałeś niepoprawne dane.");
                menuView();
                break;
        }

    }
    public void dodaj(){

    }
    public void usun(){

    }
}

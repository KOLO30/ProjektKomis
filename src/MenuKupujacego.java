public class MenuKupujacego {
    public void menuView(){
        Menu menu = new Menu();
        System.out.println("Co chcesz zrobic? \n" +
                "1. Oglądać samochody\n" +
                "2. Kupić samochód\n" +
                "3. Wyjść");
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
            default:
                System.out.println("Uważaj! Podałeś niepoprawne dane.");
                menuView();
                break;
        }
    }
    public void kup(){

    }
}

package menu;

import Dane.InputData;
import Dane.Odczyt;

public class WyswietlSamochody {
    InputData inputData = new InputData();
    public void wyswietl(){
        System.out.println("Wyświetlanie samochodu. Wybierz typ samochodu do oglądania:\n" +
                "1. Osobowy\n" +
                "2. Elektryczny\n" +
                "3. Dostawczy\n" +
                "4. Wszystkie\n"+
                "5. Powrót");
        int b = inputData.InputInt();
        switch (b){
            case 1:
            case 2:
            case 3:
                Odczyt.odczytPliku(b);
                break;
            case 4:
                for(int i=1;i<4;i++){
                    Odczyt.odczytPliku(i);
                }
                break;
            case 5:
                return;
            default:
                wyswietl();
                break;
        }
    }
}

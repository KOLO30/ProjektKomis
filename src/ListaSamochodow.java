import java.util.ArrayList;
import java.util.List;

public class ListaSamochodow {
    private List<Samochod> auta = new ArrayList<>();

    //dodanie samochodu do listy
    public void dodajAuto(Samochod s){
       auta.add(s);
    }

    //wyświetlanie listy samochodów
    public void wyswietl(){
        if(auta.isEmpty()){
            System.out.println("W naszym komisie nie ma samochodów");
        }
        for(int i=0; i<auta.size();i++){
            System.out.println(i+". "+auta.get(i));
        }
    }


}

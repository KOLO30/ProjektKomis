package Dane;

import Błędy.BladPojazdu;
import menu.Menu;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usun {
    public void usunZPliku(String n,int d,String kto){
        //przypisanie ściezki do pliku
        String plik1 = "src/plikiTekstowe/listaSamochodowOsobowych.txt";
        String plik2 = "src/plikiTekstowe/listaSamochodowElektrycznych.txt";
        String plik3 = "src/plikiTekstowe/listaSamochodowDostawczych.txt";
        String p;

        //utworzenie list które będą przechowywać informację o samochodach
        List<String> samochodyOsobowe = new ArrayList<>();
        List<String> samochodyElektryczne = new ArrayList<>();
        List<String> samochodyDostawcze = new ArrayList<>();
        List<String> l;

        switch (n){
            case "1":
                p=plik1;
                l=samochodyOsobowe;
                break;
            case "2":
                p=plik2;
                l=samochodyElektryczne;
                break;
            case "3":
                p=plik3;
                l=samochodyDostawcze;
                break;
            default:
                return;
        }
        //odczyt pliku
        try (BufferedReader reader = new BufferedReader(new FileReader(p))){
            String linia= reader.readLine();

           int ile=1;

            if(linia!=null){
                l.add(linia);
                ile++;
            }
            while ((linia = reader.readLine())!= null ){
                ile++;
                l.add(linia);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        //sprawdzanie czy urzytkownik podał poprawną wartość
        if(d<0 || d>l.size()){
            System.out.println("Nie znaleziono podanego samochodu");
            return;
        }
        else if(Objects.equals(kto, "sprzedawca")){
            l.remove(d-1);
            System.out.println("Pomyślnie usunięto samochód nr:"+ d);
        }
        else if(Objects.equals(kto, "kupujacy")){
            l.remove(d-1);
            System.out.println("Pomyślnie zakupiono saomochód nr:"+ d );

        }
        //nadpisanie starego pliku nowymi danymi(bez usuniętego samochodu)
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(p))){
            for(String i : l){
                writer.write(i);
                writer.newLine();
            }
        }
        catch (BladPojazdu bladPojazdu){
            throw new BladPojazdu("Błąd!");
        }
        catch (IOException e){
            System.out.println("Błąd podczas zapisu");
        }
    }

}

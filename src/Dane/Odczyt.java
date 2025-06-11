package Dane;

import Błędy.BladPojazdu;
import TypySamochodow.Osobowy;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Odczyt {
    public static void odczytPliku(String n){
        //przypisanie ściezki do zmiennej
        String plik1 = "src/plikiTekstowe/listaSamochodowOsobowych.txt";
        String plik2 = "src/plikiTekstowe/listaSamochodowElektrycznych.txt";
        String plik3 = "src/plikiTekstowe/listaSamochodowDostawczych.txt";
        String p;

        //utworzenie listy przechowującej dane o samochodach
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
        //odczytanie i wypisanie na ekran danych o samochodach
        try (BufferedReader reader = new BufferedReader(new FileReader(p))){
            int nn = Integer.parseInt(n);
            String linia= reader.readLine();
            if(nn==1 && linia != null)
                System.out.println("\nAuta Osobowe:");
            else if(nn==1 && linia == null)
                System.out.println("\nBrak aut osobowych");
            if(nn==2 && linia != null)
                System.out.println("\nAuta Elektryczne:");
            else if(nn==2 && linia == null)
                System.out.println("\nBrak aut elektrycznych");
            if(nn==3 && linia != null)
                System.out.println("\nAuta Dostawcze:");
            else if(nn==3 && linia == null)
                System.out.println("\nBrak aut dostawczych\n");

            int ile=1;

            if(linia!=null){
                System.out.print(ile +". ");
                ile++;
                System.out.println(linia);
                l.add(linia);
            }
            while ((linia = reader.readLine())!= null ){
                System.out.print(ile +". ");
                ile++;
                System.out.println(linia);
                l.add(linia);
            }
        }
         catch (IOException e) {
             System.out.println("Błąd podczas odczytu");
        }
    }
}

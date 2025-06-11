package Dane;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Zapis {
    public static void zapisDoPliku(String s,String n){
        //przypisanie odpowiedniej ścieżki do odpowiadającej zmiennej
       String plik1 = "src/plikiTekstowe/listaSamochodowOsobowych.txt";
        String plik2 = "src/plikiTekstowe/listaSamochodowElektrycznych.txt";
        String plik3 = "src/plikiTekstowe/listaSamochodowDostawczych.txt";
        String p;
        switch (n){
            case "1":
                p=plik1;
                break;
            case "2":
                p=plik2;
                break;
            case "3":
                p=plik3;
                break;
            default:
                return;
        }
        //zapis do pliku
       try(BufferedWriter writer = new BufferedWriter(new FileWriter(p,true))){
           writer.write(s);
           writer.newLine();
           System.out.println("Dodano samochód");
       }
       catch (IOException e){
           System.out.println("Błąd zapisu");
           e.printStackTrace();
       }
   }

}

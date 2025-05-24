package Dane;

import TypySamochodow.Osobowy;
import TypySamochodow.Samochod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zapis {
    public static void zapisDoPliku(String s,int n){
       String plik1 = "src/plikiTekstowe/listaSamochodowOsobowych.txt";
        String plik2 = "src/plikiTekstowe/listaSamochodowElektrycznych.txt";
        String plik3 = "src/plikiTekstowe/listaSamochodowDostawczych.txt";
        String p;
        switch (n){
            case 1:
                p=plik1;
                break;
            case 2:
                p=plik2;
                break;
            case 3:
                p=plik3;
                break;
            default:
                return;
        }
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

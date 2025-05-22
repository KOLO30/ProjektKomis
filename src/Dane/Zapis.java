package Dane;

import TypySamochodow.Osobowy;
import TypySamochodow.Samochod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Zapis {
   public static void zapisDoPliku(String s){
       String plik = "src/plikiTekstowe/listaSamochodow.txt";
       try(BufferedWriter writer = new BufferedWriter(new FileWriter(plik,true))){
           writer.write(s);
           writer.newLine();
           System.out.println("ez");
       }
       catch (IOException e){
           System.out.println("Błąd zapisu");
           e.printStackTrace();
       }
   }


}

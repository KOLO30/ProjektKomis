package TypySamochodow;

import Dane.InputData;
import Dane.Zapis;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaSamochodow {
    private List<Samochod> auta = new ArrayList<>();
    InputData inputData = new InputData();
    //dodanie samochodu do listy
    public void dodajAuto(int b){
        //auta.add(s);
        System.out.println("Podaj przebieg:");
        int przebieg = inputData.InputInt();

        System.out.println("Podaj markę:");
        String marka = inputData.InputString();

        System.out.println("Podaj model:");
        String model = inputData.InputString();

        System.out.println("Podaj rocznik:");
        int rocznik = inputData.InputInt();

        System.out.println("Podaj cene:");
        double cena = inputData.InputDouble();

        switch (b){
            case 1:
            System.out.println("Podaj rodzaj paliwa:");
            String rodzajPaliwa = inputData.InputString();
            Osobowy osobowy = new Osobowy(przebieg,marka,model,rocznik,cena,rodzajPaliwa);
            Zapis.zapisDoPliku(osobowy.toString(),b);
            break;
            case 2:
                System.out.println("Poadj pojemność baterii");
                int pojemnoscBaterii = inputData.InputInt();
                Elektryk elektryk = new Elektryk(przebieg,marka,model,rocznik,cena,pojemnoscBaterii);
                Zapis.zapisDoPliku(elektryk.toString(),b);
                break;
            case 3:
                System.out.println("Podaj ładowność:");
                int ladownosc = inputData.InputInt();
                Dostawcze dostawcze = new Dostawcze(przebieg,marka,model,rocznik,cena,ladownosc);
                Zapis.zapisDoPliku(dostawcze.toString(),b);
                break;
            default:
                break;
        }

    }
    public void dodajAutoOsobowe(){
        //dodajAuto();
        //Zapis.zapisDoPliku();
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

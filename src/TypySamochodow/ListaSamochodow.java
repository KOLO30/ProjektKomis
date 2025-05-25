package TypySamochodow;

import Dane.InputData;
import Dane.Zapis;

public class ListaSamochodow {
    InputData inputData = new InputData();
    //dodanie samochodu do pliku
    public void dodajAuto(int b){
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
}

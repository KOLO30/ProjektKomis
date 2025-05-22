package TypySamochodow;

public class Dostawcze extends Samochod {
    protected double ladownosc;

    public Dostawcze(int przebieg, String marka, String model, int rocznik, double cena, String rodzajPaliwa, double ladownosc) {
        super(przebieg, marka, model, rocznik, cena);
        this.ladownosc = ladownosc;
    }
}

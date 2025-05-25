package TypySamochodow;

public class Dostawcze extends Samochod {
    protected double ladownosc;

    public Dostawcze(int przebieg, String marka, String model, int rocznik, double cena, double ladownosc) {
        super(przebieg, marka, model, rocznik, cena);
        this.ladownosc = ladownosc;
    }

    public String toString() {
        return
                "Przebieg: "+ przebieg+", "+
                        "Marka: "+marka + ", " +
                        "Model: "+ model + ", " +
                        "Rocznik: "+rocznik + ", " +
                        "Cena:"+cena + "zł, " +
                        "Ładowność: "+ ladownosc;
    }
}

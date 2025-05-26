package TypySamochodow;

public class Dostawcze extends Samochod implements Pojazd {
    @Override
    public void glosnosc() {
        System.out.println("Wysoki poziom głośności pracy silnika");
    }

    @Override
    public String typ() {
        return "Dostawczy";
    }

    protected double ladownosc;

    public Dostawcze(int przebieg, String marka, String model, int rocznik, double cena, double ladownosc) {
        super(przebieg, marka, model, rocznik, cena);
        this.ladownosc = ladownosc;
    }

    public String toString() {
        return
                "Przebieg: "+ getPrzebieg()+"km, "+
                        "Marka: "+marka + ", " +
                        "Model: "+ model + ", " +
                        "Rocznik: "+rocznik + ", " +
                        "Cena:"+cena + "zł, " +
                        "Ładowność: "+ ladownosc+"kg";
    }
}

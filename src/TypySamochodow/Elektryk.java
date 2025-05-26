package TypySamochodow;

public class Elektryk extends Samochod implements Pojazd {
    protected int pojemnoscBaterii;

    @Override
    public void glosnosc() {
        System.out.println("Niski poziom głośności pracy silnika");
    }

    @Override
    public String typ() {
        return "Elektryczny";
    }

    public Elektryk(int przebieg, String marka, String model, int rocznik, double cena, int pojemnoscBaterii) {
        super(przebieg, marka, model, rocznik, cena);
        this.pojemnoscBaterii = pojemnoscBaterii;
    }
    public String toString() {
        return
                "Przebieg: "+ getPrzebieg()+"km, "+
                        "Marka: "+marka + ", " +
                        "Model: "+ model + ", " +
                        "Rocznik: "+rocznik + ", " +
                        "Cena:"+cena + "zł, " +
                        "Pojemność baterii: "+pojemnoscBaterii+"kWh";
    }
}

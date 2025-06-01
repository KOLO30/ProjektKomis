package TypySamochodow;

public class Osobowy extends Samochod implements Pojazd{
    protected String rodzajPaliwa;
    public Osobowy(int przebieg, String marka, String model, int rocznik, double cena, String rodzajPaliwa) {
        super(przebieg, marka, model, rocznik, cena);
        this.rodzajPaliwa = rodzajPaliwa;
    }
    public Osobowy(double cena){
        super(cena);
    }

    @Override
    public String typ() {
        return "osobowy";
    }

    @Override
    public void glosnosc() {
        System.out.println("Średni poziom głośności pracy silnika");
    }

    @Override
    public String toString() {
        return
                "Przebieg: "+ getPrzebieg()+"km, "+
                        "Marka: "+marka + ", " +
                        "Model: "+ model + ", " +
                        "Rocznik: "+rocznik + ", " +
                        "Cena:"+cena + "zł, " +
                        "Rodzaj paliwa: "+rodzajPaliwa
                ;
    }
}

package TypySamochodow;

public class Elektryk extends Samochod {
    protected int pojemnoscBaterii;

    public Elektryk(int przebieg, String marka, String model, int rocznik, double cena, int pojemnoscBaterii) {
        super(przebieg, marka, model, rocznik, cena);
        this.pojemnoscBaterii = pojemnoscBaterii;
    }
    public String toString() {
        return
                przebieg+" "+
                        marka + " " +
                        model + " " +
                        rocznik + " " +
                        cena + " " +
                        pojemnoscBaterii
                ;
    }
}

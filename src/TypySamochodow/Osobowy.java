package TypySamochodow;

public class Osobowy extends Samochod{
    protected String rodzajPaliwa;

    public Osobowy(int przebieg, String marka, String model, int rocznik, double cena, String rodzajPaliwa) {
        super(przebieg, marka, model, rocznik, cena);
        this.rodzajPaliwa = rodzajPaliwa;
    }

    @Override
    public String toString() {
        return
                przebieg + ' '+
                marka + ' ' +
                model + ' ' +
                rocznik + ' ' +
                cena + ' ' +
                rodzajPaliwa
                ;
    }
}

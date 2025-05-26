package TypySamochodow;

public abstract class Samochod {
    private int przebieg;
    protected String marka;
    protected String model;
    protected int rocznik;
    protected double cena;

    public Samochod(int przebieg, String marka, String model, int rocznik, double cena) {
        this.przebieg = przebieg;
        this.marka = marka;
        this.model = model;
        this.rocznik = rocznik;
        this.cena = cena;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }
}

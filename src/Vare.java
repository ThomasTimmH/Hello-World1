public class Vare {
    private String navn;
    private double pris;

    public Vare(String navn, double pris) {
        this.navn = navn;
        this.pris = pris;
    }

    public double getPris() {
        return pris;
    }

    public String getNavn() {
        return navn;
    }

    public String toString() {
        return navn + " de koster " + pris + " kr stykket";
    }


}

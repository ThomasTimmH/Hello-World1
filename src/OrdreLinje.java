public class OrdreLinje {
    private int antal;
    private Vare vare;

    public OrdreLinje(Vare vare, int antal) {
        this.antal = antal;
        this.vare = vare;
    }

    public double varePrisTilsammen() {
        double sum = antal * vare.getPris();
        return sum;
    }


    public String toString() {
        return "Du har valgt at købe " + antal + " " + vare + " Prisen er " + varePrisTilsammen();
    }
}

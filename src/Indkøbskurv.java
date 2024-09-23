import java.util.ArrayList;

public class Indkøbskurv {

    private ArrayList<OrdreLinje> ordreArray = new ArrayList<>();

    public void tilføjOrdre(OrdreLinje ordre) {
        ordreArray.add(ordre);
    }

    public double totalPris() {
        double total = 0;

        for (OrdreLinje ordre : ordreArray) {
            double ordrePris = ordre.varePrisTilsammen();
            total += ordrePris;
        }
        return total;
    }

    public String toString() {
        return "Du har købt for "+totalPris()+" kr";
    }
}






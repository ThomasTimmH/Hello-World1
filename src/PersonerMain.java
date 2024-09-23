import java.util.ArrayList;
import java.util.List;

public class PersonerMain {
    public static void main(String[] args) {


        ArrayList<Personer> persondatabase = new ArrayList<Personer>();

        Personer person1 = new Personer("Hussain", 23, 75, 175);
        Personer person2 = new Personer("Muzaffer", 20, 75, 183);
        Personer person3 = new Personer("Thomas", 21, 65, 170);

        ArrayList<Personer> persondatabase1 = new ArrayList<Personer>(List.of(person1, person2, person3));

        String søgehøjde = "170";

        double højde = Double.parseDouble(søgehøjde);

        boolean fundet = false;
        for (Personer p : persondatabase1) {
            if (højde < p.getHeight()) {
                System.out.println("Personen er fundet og er " + p.getName());
                fundet = true;
            }
            if (!fundet) {
                System.out.println("Personen blev desværre ikke fundet");
                fundet = false;
            }

        }
    }
}
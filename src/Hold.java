import java.util.ArrayList;

public class Hold {
    private ArrayList<Studerende> holdAfStuderende = new ArrayList<>();

    public void tilføjStuderende(Studerende studerende) {
        holdAfStuderende.add(studerende);
    }

    public String toString() {
        String result = " ";
        for (Studerende studerende : holdAfStuderende) {
            result += "\n Navn : " + studerende.getNavn() + "\n Mail : " + studerende.getMailaddrese();
        }
        return result;

    }

    public Studerende søgStuderende(String søgenavn) {
        for (Studerende studerende : holdAfStuderende) {
            if (søgenavn.equalsIgnoreCase(studerende.getNavn())) {
                return studerende;
            }
        }
            return null;
    }
}
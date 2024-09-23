import java.util.Scanner;

public class MainStuderende {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hold hold1 = new Hold();
Studerende student1 = new Studerende("Thomas", "thha0006@stud.kea.dk");
Studerende student2 = new Studerende("Hussain","HussainOmar5@gmail.com");
hold1.tilføjStuderende(student1);
hold1.tilføjStuderende(student2);
        System.out.println(hold1);
        System.out.println("Indtast det navn du leder efter");
        String søgenavn = scan.nextLine();
        Studerende fundet = hold1.søgStuderende(søgenavn);
        if(fundet == null){
            System.out.println("Du fandt ikke personen");
        } else{
            System.out.println("Du fandt personen " + søgenavn);
        }
        System.out.println("Indtast nyt navn på den søgte studerende");
        String nytNavn = scan.nextLine();
        fundet.setNavn(nytNavn);

        System.out.println("Indtast ny en ny mail til den søgte person");
        String nyMail = scan.nextLine();
        fundet.setMailaddrese(nyMail);

        System.out.println(hold1);







    }
}

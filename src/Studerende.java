public class Studerende {
    private String navn;
    private String mailaddrese;

    public Studerende(String navn, String mailaddrese) {
        this.navn = navn;
        this.mailaddrese = mailaddrese;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }


    public void setMailaddrese(String mailaddrese) {
        this.mailaddrese = mailaddrese;
    }

    public String getMailaddrese() {
        return mailaddrese;
    }
    public String toString() {
        return "Navn : " + navn + " Mail : " + mailaddrese;
    }

}

public class Main {
    public static void main(String[] args) {
        Vare mælk = new Vare("Mælk", 25);
        Vare weed = new Vare("Weed", 100);
        Vare poser = new Vare("poser", 5);

        OrdreLinje antal1 = new OrdreLinje(mælk, 4);
        OrdreLinje antal2 = new OrdreLinje(weed, 2);
        OrdreLinje antal3 = new OrdreLinje(poser, 1);

        Indkøbskurv kurv1 = new Indkøbskurv();

        kurv1.tilføjOrdre(antal1);
        kurv1.tilføjOrdre(antal2);
        kurv1.tilføjOrdre(antal3);

        System.out.println(antal1);
        System.out.println(antal2);
        System.out.println(antal3);
        System.out.println(kurv1);

    }
}
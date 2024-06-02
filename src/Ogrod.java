package src;

public class Ogrod extends Dom {
    public Ogrod(String drzewa, String kwiaty, String warzywa, String owoce) {
        super(drzewa, kwiaty, warzywa, owoce);
    }

    public void zasadz() {
        System.out.println("Trzeba zasadzic wisterie");
        System.out.println(drzewa);
        System.out.println(kwiaty);

    }
    public void przytnij() {
        System.out.println("Trzeba przyciac hortensje");

    }
}

package src;

public class Warzywnik extends Dom {


    public Warzywnik(String drzewa, String kwiaty, String warzywa, String owoce) {
        super(drzewa, kwiaty, warzywa, owoce);
    }

    //metody:
    public void nawiez() {
        System.out.println("Trzeba nawiezc warzywa obornikiem");
        System.out.println(warzywa);
        System.out.println(owoce);


    }
    public void zbierz() {
        System.out.println("Trzeba zebrac warzywa, ktore sa dojrzale");

    }
}

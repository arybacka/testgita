package src;

public class Dom {

    //zmienne:

    public String drzewa;
    public String kwiaty;
    public String warzywa;
    public String owoce;

    public Dom (String drzewa, String kwiaty, String warzywa, String owoce) {
        this.drzewa=drzewa;
        this.kwiaty=kwiaty;
        this.owoce=owoce;
        this.warzywa=warzywa;
    }

    //metody:

    public void rosnij() {
        System.out.println("Rosnij zdrowo");
    }
    public void podlej() {
        System.out.println("Trzeba podlac");
    }
    public void wyrwij() {
        System.out.println("Trzeba wyrwac chwasty");
    }
}

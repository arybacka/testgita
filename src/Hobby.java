package src;

public class Hobby {

    //zmienne:
    public int liczbaKsiazek;
    public int liczbaSeriali;
    public String tytulKsiazki;
    public String tytulSerialu;

    //metody:

    public Hobby(int liczbaKsiazek, int liczbaSeriali, String tytulKsiazki, String tytulSerialu) {
        this.liczbaKsiazek=liczbaKsiazek;
        this.liczbaSeriali=liczbaSeriali;
        this.tytulKsiazki=tytulKsiazki;
        this.tytulSerialu=tytulSerialu;
    }

    public void czytalam() {
        System.out.println("Czytalam " + liczbaKsiazek);
    }

    public void ogladalam() {
        System.out.println("Ogladalam " + liczbaSeriali);
    }
}

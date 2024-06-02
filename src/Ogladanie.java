package src;

public class Ogladanie extends Hobby{
    public Ogladanie(int liczbaKsiazek, int liczbaSeriali, String tytulKsiazki, String tytulSerialu) {
        super(liczbaKsiazek, liczbaSeriali, tytulKsiazki, tytulSerialu);
    }

    public void wypisz() {
        System.out.println(tytulKsiazki + " " + liczbaKsiazek);
        System.out.println(tytulSerialu + " " + liczbaSeriali);
    }


}

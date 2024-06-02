package src;

public class Czytanie extends Hobby{
    public Czytanie(int liczbaKsiazek, int liczbaSeriali, String tytulKsiazki, String tytulSerialu) {
        super(liczbaKsiazek, liczbaSeriali, tytulKsiazki, tytulSerialu);
    }



    public void liczbaKsiazekiSeriali() {
        System.out.println("Przeczytalam i obejrzalam " + (liczbaKsiazek + liczbaSeriali));
    }


}

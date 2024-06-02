package src;

public class HobbyTest {
    public static void main(String[] args) {
        Czytanie czytanie = new Czytanie(6, 10, "Romeo i Julia", "Krucjata");

        Ogladanie ogladanie = new Ogladanie(3, 6, "Scherlock Holmes", "Walking Dead");

        czytanie.liczbaKsiazekiSeriali();
        czytanie.czytalam();
        czytanie.ogladalam();
        ogladanie.wypisz();
        ogladanie.czytalam();
        ogladanie.ogladalam();
    }


}

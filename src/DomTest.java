package src;

public class DomTest {
    public static void main(String[] args) {
        Warzywnik warzywnik = new Warzywnik("katalpa", "hortensje", "papryka", "truskawki");

        Ogrod ogrod = new Ogrod("katalpa", "hortensje", "pomidory", "maliny");


        //pod spodem wszystko z malej bo wyzej mam warzywnik i ogrod przed znakiem '=' z malej

        warzywnik.rosnij();
        warzywnik.podlej();
        warzywnik.wyrwij();
        ogrod.rosnij();
        ogrod.podlej();
        ogrod.wyrwij();

        warzywnik.nawiez();
        warzywnik.zbierz();

        ogrod.zasadz();
        ogrod.przytnij();
    }
}


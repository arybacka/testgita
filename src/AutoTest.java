package src;

public class AutoTest {
    public static void main(String[] args) {
      /*  Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 1000; */

        Auto mercedes = new Auto ("Mercedes", "Klasa S", 2021, 1000);


        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

      /*  Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2020;
        audi.przebieg = 0; */

        Auto audi = new Auto ("Audi", "A5", 2020, 0);

        audi.info();
        audi.jedz();
        audi.hamuj();

      /*  Auto noName = new Auto();

        noName.jedz();
        noName.hamuj();
        noName.info(); */

    }
}

package src;

public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 0;

        if (dzielnik != 0) {
            System.out.println("wynik dzielenia: " + dzielna / dzielnik);
        } else {
            System.out.println("Prosze podaj inna liczbe");
        }
    }
}

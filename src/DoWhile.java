package src;

public class DoWhile {
    public static void main(String[] args) {
        int number = 21;
        do {
            System.out.println("Moja wartosc to: " + number + " i jest mniejsza od 20");
            number++;
        } while (number < 20); //najpierw wykonujemy sprawdzenie a potem czy jest poprawny
    }
}


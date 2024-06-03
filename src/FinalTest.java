package src;

public class FinalTest {
    public static void main(String[] args) {
        final int x = 2; // final powoduje ze nie mozna zmienic wartosci

        final Person person = new Person("Tim", 26); // w typach obiektowych nie mozna przypisac nowego obiektu
        person.age = 25;

        // person = new Person("Tom", "22");
    }
}
// w metodach public void nie mozna nadpisac metody jezeli uzyje  sie final
// w klasach nie mozna dziedziczyc klasy jezeli uzyje sie 'final

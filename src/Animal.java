package src;

//klasa abstrakcyjna: dodajemy abstract w nazwie
public abstract class Animal {
    public final static int legs = 4;
    public abstract void sound(); // metoda abstrakkcyjna
    public void sayHello() {
        System.out.println("Hello I am an animal!");
    }
}

package src;

public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze MathTeacher");
        this.school=school;
    }

    public void walk() {
        super.walk(); // zostanie wywolana metoda z klasy person, czyli nadrzednej
        System.out.println("I walk very fast");
    }
    public void teachMath() {

        System.out.println("I'm teaching math!");
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}

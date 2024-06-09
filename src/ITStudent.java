package src;

public class ITStudent implements Student2 {

    @Override
    public void sayHello(String name, int age) {
        System.out.println("I am IT guy");
        System.out.println("My name is " + name);
    }
}

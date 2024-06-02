package src.Identifiers.second;

import src.Identifiers.first.Parent; //pojawia sie po wcisnieciu alt+enter

public class Child extends Parent {

    //klasa potomna w innej paczce nie ma dostepu do pol /metod private oraz default, czyli bez identyfikatora
    public void testIdentifiers() {
        System.out.println(first);
        // System.out.println(second);
        System.out.println(third);
        firstMethod();
        //secondMethod();
        thirdMethod();


    }
}

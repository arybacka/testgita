package src.Identifiers.second;

import src.Identifiers.first.Parent;

public class Random {

    //klasa w innej paczce nie ma dostepu do pol/metod private oraz default czyli bez identyfikatora oraz protected
    public void testIdentifier() {
        Parent parent = new Parent();

        System.out.println(parent.first);
       // System.out.println(parent.third);
        parent.firstMethod();
      //  parent.thirdMethod();

}
}


package src.Identifiers.first;

public class Random {

    public void testIdentifiers() {


        // klasa w tej samej paczce nie ma dostepu do pol/metod private
        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
       // System.out.println(parent.fourth);
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
      //  parent.fourthMethod();
    }
}

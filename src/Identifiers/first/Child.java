package src.Identifiers.first;

public class Child extends Parent {


        public void testIdentifiers() {
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
           // System.out.println(fourth); //prywatne pole jest tylko wewnatrz klasy. Klasa potomna w tej samej paczce nie ma dostepu do klasy rodzica
            firstMethod();
            secondMethod();
            thirdMethod();
           // fourthMethod();

    }
}

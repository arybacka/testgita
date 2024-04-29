package src;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && -> true wtedy gdy wyrazenia skladowe sa rowne true
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); //true
        System.out.println(secondValue && thirdValue); // false

        // || lub -> true gdy jedno wyrazenie skladowe jest rowne true

        System.out.println(firstValue || secondValue);
        System.out.println(firstValue || fourthValue);
        System.out.println(secondValue || thirdValue);

        // ! negacja - zwraca wartosc przeciwna do wyrazenia przed ktorym sie znajduje
        System.out.println(!firstValue);
        System.out.println(!thirdValue);
        System.out.println(!(firstValue&&secondValue));

    }
}

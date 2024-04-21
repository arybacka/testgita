package src;
// Operatory matematyczne umozliwiaja wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber; //10
        int subtraction = firstNumber - secondNumber; //-2
        int multiplication = firstNumber * secondNumber; //24
        float division = thirdNumber / secondNumber; //0,66
        int mod = secondNumber%firstNumber; // ile 4 miesci sie w 6 -> 1, 2

        System.out.println("Wynik dodania " + addition); //+
        System.out.println("Odejmowanie: " + subtraction);  //+
        System.out.println("Dzielenie: " + multiplication); //+
        System.out.println("Mnożenie: " + division); //+
        System.out.println("Modulo: " + mod); //+

    }
}

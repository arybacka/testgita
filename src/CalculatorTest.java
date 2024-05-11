package src;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Wykonaj dodawanie na tych liczbach");

        Calculator calculator = new Calculator(); //pierwsze slowo to nazwa klasy a drugie slowo to cokolwiek mozna napisac po znaku '=' musi byc znow nazwa klasy po new

      //  int addition = firstNumber + secondNumber;
        int addition = calculator.dodawanie(firstNumber, secondNumber); // uzywam tej nowej metody

       // int subtraction = firstNumber - secondNumber;
        int substraction = calculator.odejmowanie (firstNumber, secondNumber);

       // int multiplication = firstNumber * secondNumber;
        int multiplication = calculator.mnozenie(firstNumber, secondNumber);

       // int division = firstNumber / secondNumber;
        int division = calculator.dzielenie(firstNumber, secondNumber);

       // int mod = firstNumber % secondNumber;
        int modulo = calculator.modulo(firstNumber, secondNumber);

        System.out.println("Suma tych dwoch liczb wynosi: " + addition);
        System.out.println("Rożnica tych dwoch liczb wynosi: " +substraction);
        System.out.println("Mnożenie tych dwoch liczb wynosi: " + multiplication);
        System.out.println("Dzielenie tych dwoch liczb wynosi: " + division);
        System.out.println("Modulo tych dwoch liczb wynosi: " + modulo);
    }
}

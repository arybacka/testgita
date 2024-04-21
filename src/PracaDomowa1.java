package src;

import java.util.Scanner;

public class PracaDomowa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Wykonaj dodawanie na tych liczbach");

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;

        System.out.println("Suma tych dwoch liczb wynosi: " + addition);
        System.out.println("Rożnica tych dwoch liczb wynosi: " +subtraction);
        System.out.println("Mnożenie tych dwoch liczb wynosi: " + multiplication);
    }
}

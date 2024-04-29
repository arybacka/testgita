package src;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int Age = scanner.nextInt();  // bez tej linijki nie bede miala mozliwosci wpisac liczby

        if (Age < 18 && Age >= 0) {
            System.out.println("Nie mozesz kupic alkoholu");
        } else if (Age <0) {
            System.out.println("Wprowadz poprawna wartosc");
        } else {
            System.out.println("Dziekuje za zakupy ! Zapraszam ponownie !");
        }

    }
}

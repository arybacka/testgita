package src;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int Age = scanner.nextInt();  // bez tej linijki nie bede miala mozliwosci wpisac liczby

        if (Age >= 18) {
            System.out.println("Dziekuje za zakupy");
        } else {
            System.out.println("Nie mozesz kupic alkoholu");
        }

    }
}

package src;

import java.util.Scanner;

public class Exceptionscheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int Age = scanner.nextInt();

        if (Age < 0) {
            System.out.println("Nie jestes pelnoletni");
            throw new InvalidAgeException("hahaer");
        }
         else if (Age >= 18) {
            System.out.println("Jestes pelnoletni");
        }
            }
        }


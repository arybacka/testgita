package src;
//Inkrementacja - zwiekszenie wartosci o 1 (postinkrementacja - najpierw wywolujesz zmienna a potem dodajesz 1, zapis: a++;
// preinkrementacja - najpierw dodaje 1 a potem wywoluje zmienna, zapis: ++a)
//Dekrementacja  - zmniejszenie wartosci o 1

public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Wartosc a: " + a);
        int b = a++;
        System.out.println("Wartosc b: " + b);
        System.out.println("Wartosc a: " + a);
        int c =++a;
        System.out.println("Wartosc c: " + c);
        System.out.println("Wartosc a: " + a);

        //Dekrementacja
       // Predekrementacja -
        // Postdekrementacja -
        int d = 0;
        System.out.println("Wartosc d: " + d);
        int e = d--;
        System.out.println("Wartosc e: " + e);
        System.out.println("Wartosc d: " + d);
        int f = --d;
        System.out.println("Wartosc f: " + f);
        System.out.println("Wartosc d: " + d);

    }
}

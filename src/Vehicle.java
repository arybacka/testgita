package src;

public interface Vehicle {


    // interfejsy - zestaw metod bez ich implementach. Czyli z wracamy typ, nazwe ale bez ciala - czyli bez kodu w srodku
    //przy interfejsach nie daje sie 'public' bo one domyslnie sa publiczne
    void jazda(int speed);
    void stop();
    String info();
}

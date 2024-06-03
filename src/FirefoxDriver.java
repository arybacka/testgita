package src;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Uzywam przegladarki FireFox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znalazlam ten element za pomoca przegladarki Firefox");

    }
}

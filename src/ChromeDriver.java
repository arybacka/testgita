package src;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Uzywam przegladarki Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znalazlam ten element za pomoca przegladarki Chrome");
    }
}

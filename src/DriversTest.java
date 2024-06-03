package src;

public class DriversTest {
    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        chrome.get();
        chrome.findElementBy();

        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElementBy();
    }
}

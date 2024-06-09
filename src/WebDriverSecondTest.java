package src;

public class WebDriverSecondTest {
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver firefoxSecond = new FirefoxDriver();
        WebDriver firefoxThird = new FirefoxDriver();

        //klasa anonimowa to klasa definiowana, ktora ma dokladnie jedna instancje, jeden obiekt

        WebDriver safari = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Opening page with safari");
            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element with safari");

            }
        };
        safari.get();
        safari.findElementBy();

        }
    }


package src;

public class DriversTest {
    public static void main(String[] args)  throws NoValidBrowserName {
        ChromeDriver chrome = new ChromeDriver();
        chrome.get();
        chrome.findElementBy();

        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElementBy();

        WebDriver driver = getDriver("chrome");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

/*        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        chrome.findElementBy();
        chrome.findElementBy();
        chrome.findElementBy();
        chrome.findElementBy();
        chrome.findElementBy();
    } */
    }


    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name ");
    }
}
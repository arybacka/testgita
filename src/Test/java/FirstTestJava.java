import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestJava {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aryba\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");  //otwieranie okna

       // Dimension windowSize = new Dimension(200, 200); //to samo co nizej niezakomentowane
      //  driver.manage().window().setSize(windowSize);
        driver.manage().window().maximize();

        //przechodzimy do okienka z plikami cookies
      //  driver.switchTo().frame(0);

      //znalezienie przycisku
       // WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));

       //klikniecie przycisku
      //  agreeButton.click();

        //powrot do pierwotnego okna
      //  driver.switchTo();

        //zamykanie okna
        driver.close();
    }
}


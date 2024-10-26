import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

public class SeleniumTest {
    @Test
    public void openGooglePage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        //przechodzimy do okienka z plikami cookies
        driver.switchTo().frame(0);
        //znalezienie przycisku
        WebElement agreeButton = driver.findElement(By.xpath("//span[contains(text(),'Zgadzam')]"));
        //klikniecie przycisku
        agreeButton.click();
        //powrot do pierwotnego okna
        driver.switchTo().defaultContent();
        //znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        //Wprowadz wartosc selenium do pola
        searchField.sendKeys(Keys.ENTER);
        //znalezc rezultat
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//span"));

    }
}

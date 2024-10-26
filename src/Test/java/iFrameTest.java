import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class iFrameTest {
    @Test
    public void testNewWindow() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aryba\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");

        //tworzenie nowej zmiennej typu webElement, wyszukujemy element
        WebElement iframe = driver.findElement(By.cssSelector("[src='basics.html']"));


        //przelaczenie sie na strone, ktora znajduje sie w naszej(obecnej) stronie
        driver.switchTo().frame(iframe);

        driver.findElement(By.id("fname")).sendKeys("Ania");

        //cofanie sie do pierwotnego okna
        driver.switchTo().defaultContent();

        //wyprintowanie naglowka
        System.out.println(driver.findElement(By.tagName("h1")).getText());




    }
}




import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class NewWindowTest {
    @Test
    public void testNewWindow() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aryba\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //aktualne okno
        String currentWindow = driver.getWindowHandle();

        //zlokalizowanie elementu i klikniecie w niego
        driver.findElement(By.id("newPage")).click();

        //zbior wszystkich nazw okien(unikatowych)
        Set<String> windowNames  = driver.getWindowHandles();
        for (String window : windowNames) {
            if (!window.equals(currentWindow)){ //czy nazwa okna jest rozna od current window
                driver.switchTo().window(window);
            }
        }

        driver.findElement(By.cssSelector("#W0wltc")).click();

        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.switchTo().window(currentWindow);
        driver.findElement(By.name("fname")).sendKeys("Ania");



    }
}




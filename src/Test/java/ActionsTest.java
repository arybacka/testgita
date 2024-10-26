import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ActionsTest {

    @Test
    public void actionsTest() throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aryba\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");

      //klikanie prawym przyciskiem myszy:
        Actions actions = new Actions(driver);
      // actions.contextClick().perform(); //ta metoda(contextClick) wywolujemy klikniecie myszy. perform=wywolaj

       // klikniecie prawym przyciskiem w konkretny element:
        //actions.contextClick(driver.findElement(By.id("myFile"))).perform();


        //klikniecie podwojne w element:
        WebElement button = driver.findElement(By.id("bottom"));
        actions.doubleClick(button).perform();





    }
}

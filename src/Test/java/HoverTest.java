import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class HoverTest {

    @Test
    public void actionsTest() throws IOException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

      //klikanie prawym przyciskiem myszy:
        Actions actions = new Actions(driver);


        WebElement heading = driver.findElement(By.tagName("h1"));

        //najechanie na element
        actions.moveToElement(heading).perform();

    }
}

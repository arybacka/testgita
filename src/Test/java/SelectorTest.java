import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTest {

    @Test
    public void findElements() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aryba\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

      // lokalizowanie przycisku 'kliknij mnie!' za pomoca lokatora id
        By buttonId = By .id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);

     // lokalizowanie po atrybucie name:
        By firstName = By.name("fname");
        WebElement firstNameInput = driver.findElement(firstName);
       //driver.findElement(By.name("fname")); // to samo co dwie linijki wyzej tylko w inny sposob zapisane

        // lokalizowanie po atrybucie className:

        driver.findElement(By.className("topSecret"));

        //lokalizowanie elementu po znaczniku html:

      //  By inputLocator = By.tagName("input");
      //  WebElement input = driver.findElement(inputLocator);
        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("Pierwszy ");
        List<WebElement> inputs =driver.findElements(By.tagName("input"));
        System.out.println(inputs.size());

        //lokalizowanie linku:

        driver.findElement(By.linkText("Visit W3Schools.com!"));

        //druga metoda lokalizowania linku:

        By partialLink = By.partialLinkText("Visit");
        WebElement schoolPartial = driver.findElement(partialLink);

        //
    }
}
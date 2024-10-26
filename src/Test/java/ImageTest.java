import javafx.scene.control.TableColumn;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageTest {
    WebDriver driver= new ChromeDriver();
        @Test
        public void ImageTest() {
            driver.get("https://testeroprogramowania.github.io/selenium/image.html");

            WebElement image = driver.findElement(By.tagName("img"));
            String height = image.getAttribute("naturalHeight");
            System.out.println(image.getAttribute("naturalHeight"));

            Assert.assertEquals("0",height);



        }
}

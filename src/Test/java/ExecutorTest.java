import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutorTest {

    @Test
    public void executeJavascript() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aryba\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");


       //driver.findElement(By.name("1")).click();
      // driver.findElement(By.className("disc")).click();
     //  driver.findElement(By.id("actionButton")).click();//

// To jest alternatywa dla click:


        //lokalizujemy link na stronie
        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        //wywolujemy metode execute script, podajemy argument i wywolujemy na nim metode executescript
        executor.executeScript("arguments[0].click();",basicPageLink);

        //lokalizacja elementu:
        WebElement firstName = driver.findElement(By.name("fname"));

        //przekazanie elementu jako argumentu pierwszego, dlatego indeks 0, podajemy nazwe(value) atrybutu i wartosc(bartek)
        executor.executeScript("arguments[0].setAttribute('value', 'Bartek')", firstName);



    }
}

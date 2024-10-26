import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;


public class FinalHomework {


// klikniecie w przycisk,
// klikniecie na link
//pobieranie wartosci z tabeli
//

    @Test
    public void FinalHomework() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aryba\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        WebElement heading = driver.findElement(By.tagName("h1"));

        driver.findElement(By.id("clickOnMe")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.findElement(By.id("fname")).sendKeys("Ania");

        driver.findElement(By.linkText("Visit W3Schools.com!")).click();

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement table = driver.findElement(By.tagName("table"));
        List<WebElement> rowsList = table.findElements(By.tagName("tr"));
        List<WebElement> columnsList = null;

        for (WebElement row : rowsList) {
          //  columnsList = row.findElements(By.tagName("th")); // szukanie po wierszach tabeli Month Saving, January
        columnsList = row.findElements(By.tagName("td")); //cala tabela
            for (WebElement column : columnsList) {
                System.out.println("values for columns: " + column.getText()); //wartosci dla tabeli january
            }
        }

        //dzialanie na dropdownach:

        WebElement SelectDropdown=driver.findElement(By.tagName("select"));
        Select dropdown = new Select(SelectDropdown);
        dropdown.selectByValue("saab");
        dropdown.selectByIndex(0);

        List<WebElement> All = dropdown.getOptions();
        for (WebElement option: All) {
           System.out.println(option.getText());
        }
    }
}


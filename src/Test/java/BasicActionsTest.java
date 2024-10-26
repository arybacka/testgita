import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import java.util.List;

public class BasicActionsTest {

    @Test
    public void performAction() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aryba\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        //lokalizujemy link na stronie
        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        System.out.println(basicPageLink.getText()); //wyprintuje tytul
        //klikamy w ten link
        basicPageLink.click();
        //lokalizujemy button i klikamy na niego
       // driver.findElement(By.id("clickOnMe")).click();

        //wpisywanie wartosci w polu tekstowym
        driver.findElement(By.id("fname")).sendKeys("Ania");
        //usuwanie wartosci z pola tekstowego
        WebElement usernameInput = driver.findElement(By.name("username")); //to samo co ponizej, ale nazwane i potem wywolywac po nazwie mozna
        usernameInput.clear();
        usernameInput.sendKeys("admin");
        //driver.findElement(By.name("username")).clear();
        //driver.findElement(By.name("username")).sendKeys("admin");

        //pobieranie wartosci z pola
        System.out.println(usernameInput.getText());
        System.out.println(usernameInput.getAttribute("value"));

       //zasymulowanie nacisniecia przycisku enter
        usernameInput.sendKeys(Keys.ENTER);

        //obsluzenie alertu - zaakceptowanie go
        Alert firstAlert =  driver.switchTo().alert();
        firstAlert.accept();

        //obsluzenie drugiego alertu:
        driver.switchTo().alert().accept();

        //nacisniecie przycisku TAB
       // usernameInput.sendKeys(Keys.TAB);

        //zaznaczanie checkoboxa:
        driver.findElement(By.cssSelector("[type='checkbox']")).click();

        //zaznaczanie radiobuttona:
        driver.findElement(By.cssSelector("[value='female']")).click();

        //wybieranie wartosci z dropdowna(selecta)
        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar); //wchodzenie do dropdowna
        cars.selectByIndex(2);
        cars.selectByVisibleText("Saab"); //wybieranie po tekscie
        cars.selectByValue("volvo"); //wybieranie po value

        //pobieramy wszystkie dostepne opcje z selecta(dropdowna):
        List<WebElement> options = cars.getOptions(); //opakuje to w liste elementow
       for (WebElement option : options) {
           System.out.println(option.getText());
       }

       HomeWork selectCheck = new HomeWork();
        System.out.println(selectCheck.checkOption("Audi", selectCar));
        System.out.println(selectCheck.checkOption("Jeep", selectCar));


        //wyprintowanie tekstu elementu ukrytego to tylko ta metoda:
        WebElement para = driver.findElement(By.cssSelector(".topSecret"));
        System.out.println("By attr text context: " + para.getAttribute("textContent"));


    }
}

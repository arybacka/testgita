import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsTest {

    @Test
    public void findElements() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aryba\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");


        //wyszukiwanie po id:
        By cssId = By.cssSelector("#clickOnMe");
        driver.findElement(cssId);

        //prostszy sposob:
        driver.findElement(By.cssSelector("#clickOnMe"));

        //wyszukiwanie po klasie:
        driver.findElement(By.cssSelector(".topSecret"));

        //wyszukiwanie po css Tag:

        driver.findElement(By.cssSelector("input")).sendKeys("Pierwszy"); //sendKeys po to zeby wpisac wartosc w polu


        //wyszukiwanie po css name:

       driver.findElement(By.cssSelector("[name='fname']"));

       //wyszukiwanie po klasie metoda 2:
        driver.findElement(By.cssSelector("[class='topSecret']"));

        //wyszukiwanie wszystkich css selectorow:

        driver.findElement(By.cssSelector("*"));

        //wyszukiwanie list po css:

        driver.findElement(By.cssSelector("div ul"));

        //wyszukiwanie tabeli po css:
        driver.findElement(By.cssSelector("table tr"));

        //wyszukiwanie wiersza w tabeli po css:
        driver.findElement(By.cssSelector("tbody tr"));

        //wyszukiwanie konkretnej kropki z listy(ktora jest dzieckiem): - zla praktyka !

        driver.findElement(By.cssSelector("div > ul"));
        driver.findElement(By.cssSelector("tbody > tr"));

        // wyszukiwanie pierwszego tagu 'form' ktory wystepuje po tagu 'label:

        driver.findElement(By.cssSelector("label + form"));

        //wyszukiwanie wszystkich tagow 'form' znajdujacych sie po tagu 'label':

        driver.findElement(By.cssSelector("label ~ form"));

        //wyszukiwanie tagow dla ktorych wartosc name ma 'fname'(cala nazwa):

        driver.findElement(By.cssSelector("input[name='fname']"));

        //wyszukiwanie wszystkich elementy dla ktorych wartosc atrybutu name zawiera w nazwie 'name':

        driver.findElement(By.cssSelector("[name*='name']"));

        //wyszukiwanie wszystkich elementow, dla ktorych wartosc atrybutu name zaczyna sie na 'f':

        driver.findElement(By.cssSelector("[name^='f']"));

        //wyszukiwanie wszystkich elementow, dla ktorych wartosc atrybutu name konczy sie na 'name':

        driver.findElement(By.cssSelector("[name$='name']"));

        // wyszukiwanie pierwszego dziecka z listy:

        driver.findElement(By.cssSelector("li:first-child"));

        //wyszukiwanie ostatniego dziecka z lity:

        driver.findElement(By.cssSelector("li:last-child"));

        //wyszukiwanie trzeciego dziecka z listy:

        driver.findElement(By.cssSelector("li:nth-child(3)"));


    }
}

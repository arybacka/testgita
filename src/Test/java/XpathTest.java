import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class XpathTest {

    @Test
    public void findElements() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aryba\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

      // lokalizowanie przycisku 'kliknij mnie!' za pomoca selektora xpath
        By buttonId = By.xpath("/html/body/button[@id='clickOnMe']");
        WebElement clickOnMeButton = driver.findElement(buttonId);

     // lokalizowanie po selektorze name:
        By firstName = By.xpath("//input[@name='fname']");
        WebElement firstNameInput = driver.findElement(firstName);
      // driver.findElement(By.xpath("//input[@name='fname']")); // to samo co dwie linijki wyzej tylko w inny sposob zapisane

        // lokalizowanie po selektorze className:

        driver.findElement(By.xpath("//p[@class='topSecret']"));

        //lokalizowanie elementu po selektorze html:

        By inputLocator = By.xpath("//input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("Pierwszy ");
        List<WebElement> inputs =driver.findElements(By.xpath("//input"));
        System.out.println(inputs.size());

        //lokalizowanie linku za pomoca xpath:

        driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']")); // a=link, text-ktorych tekst jest rowny visit W3Schools

        //druga metoda lokalizowania linku:

      By partialLink = By.xpath("//a[contains(text(),'Visit')]");
      WebElement schoolPartial = driver.findElement(partialLink);


        By fullPath = By.xpath("/html/body/div/ul");
        driver.findElement(fullPath);
        //  driver.findElement(By.xpath("/html/body/div/ul"));  //skrocona wersja tego wyzej

        By shortPath = By.xpath("//ul");
        driver.findElement(shortPath);
        //driver.findElement(By.xpath("//ul")); //skrocona wersja tego wyzej

        //szukanie za pomoca xpatha po wszystkich tagach
       // By allXpath = By.xpath("//*");
       // driver.findElement(allXpath);
        driver.findElement(By.xpath("//*"));

        //szukanie po selektorze z indeksem np. 2, czyli wynajduje drugi
        driver.findElement(By.xpath("(//input)[2]"));

        //szukanie po ostatnim elemencie
        driver.findElement(By.xpath("(//input)[last()]"));

        //szukanie dowolnego elemenetu w calej  strukturze, ktory bedzie zawieral atrybut name
        driver.findElement(By.xpath("//*[@name]"));

        // szukanie buttona dla ktorego wartosc atrybutu id jest rowna click on me:

        driver.findElement(By.xpath("//button[@id='clickOnMe']"));

        //szukanie id nie rownego click on me:
        driver.findElement(By.xpath("//*[@id!='clickOnMe']"));

        //szukanie atrybutu zawierajacego 'ame' w nazwie
        driver.findElement(By.xpath("//*[contains(@name,'ame')]"));

        //szukanie atrybutu name, ktorego wartosc rozpoczyna sie od 'user'

        driver.findElement(By.xpath("//*[starts-with(@name, 'user')]"));

        //szukanie atrybutu name konczacego sie na 'name'
        driver.findElement(By.xpath("//*[substring(@name,string-length(@name)-string-length('name')+1)='name']"));

       //wyszukanie dziecka div'a, ktore jest ul'em:
       By child = By.xpath("//div/child::ul");

       //wyszukanie wszystkich wstepnych diva, ktore sa ul'em:
       By desc = By.xpath("//div/descendant::ul");

       //wyszukanie wszystkich tagow nad divem(cofamy sie do rodzica):
       By parent = By.xpath("//div/../..");

       //wyszukanie tagow nastepujacych nad naszym elementem(czyli nad divem):
       By asc = By.xpath("//div/ancestor::*");

       //wyszukanie wszystkich tagi, ktore nastepuja po img(po naszym obrazku):
       By foll = By.xpath("//img/following::*");

       //wyszukanie tagow, ktore znajduja sie w tej samej strukturze co img(co obrazek):
       By follSib = By.xpath("//img/following-sibling::*");

       //wyszukanie elementow, ktore znajduja sie przed
       By prec = By.xpath("//img/preceding::*");

       //
       By precSib = By.xpath("//img/preceding-sibling::*");

       driver.findElement(child);
        driver.findElement(desc);
        driver.findElement(parent);
        driver.findElement(asc);
        driver.findElement(foll);
        driver.findElement(follSib);
        driver.findElement(prec);
        driver.findElement(precSib);

        //wyszukanie divow i linkow:
        By divsAndLinks = By.xpath("//a | //div");

        //wyszukanie inputu ktorego name=fanme i id = fname:
        By andOp = By.xpath("//input[@name='fname' and @id='fname']");

        //wyszukanie inputu ktorego name=fanme lub id = fname:
        By orOp = By.xpath("//input[@name='fname' or @id='fname']");

        driver.findElement(divsAndLinks);
        driver.findElement(andOp);
        driver.findElement(orOp);

        //
        /html/body/button[1]
    }
}
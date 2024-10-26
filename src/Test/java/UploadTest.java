import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;

public class UploadTest {

    @Test
    public void uploadFile() throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aryba\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        int randomNumber = (int) (Math.random()*1000);
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");


        //wrzucanie pliku za pomoca selenium:

       // driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\aryba\\OneDrive\\Pulpit\\testfile.txt");

       //wrzucanie pliku za pomoca skirluxa

        //zcastowanie drivera
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        //pobieranie screenshota z naszej aplikacji:
       // File srcFile = screenshot.getScreenshotAs(OutputType.FILE); //output type jest enumem
        //przekopiowanie pliku do lokalizacji jaka nas interesuje
       // FileUtils.copyFile(srcFile,new File("src/Test/resources/screenshot.png"));

       //jesli nie chcemy nadpisywac naszych screenshotow to musimy miec unikalna nazwe lub:

        File before = screenshot.getScreenshotAs(OutputType.FILE);
        String fileName = "beforeUpload" + randomNumber + ".png";
        //przed zaladowaniem pliku robimy screenshota:
        FileUtils.copyFile(before,new File("src/Test/resources/" + fileName));

        //ladujemy plik
        driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\aryba\\OneDrive\\Pulpit\\testfile.txt");
      //  File after = screenshot.getScreenshotAs(OutputType.FILE);

        //robimy screena po zaladowaniu pliku
      //  FileUtils.copyFile(after,new File("src/Test/resources/afterUpload.png"));

//klikanie prawym przyciskiem myszy:
        Actions actions = new Actions(driver);
        actions.contextClick().perform();
        actions.contextClick(driver.findElement(By.id("myFile"))).perform();
    }
}

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class GetPageInfoTest {

    @Test
    public void getInfo() {

      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aryba\\Downloads\\chrome-win64\\chrome-win64");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //pobieramy tytul strony
        System.out.println(driver.getTitle());

        //pobieramy nazwe strony:
        System.out.println(driver.getCurrentUrl());

        //
    }
}

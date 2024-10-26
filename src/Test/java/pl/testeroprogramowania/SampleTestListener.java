package pl.testeroprogramowania;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class SampleTestListener implements ITestListener {

    @Override
        public void onTestStart(ITestResult iTestResult) {
        System.out.println("I am starting test");
        }

        @Override
    public void onTestSuccess(ITestResult iTestTesult) {

        }

        @Override
    public void onTestFailure(ITestResult iTestResult) {

            WebDriver driver = DriverFactory.getDriver();

            int randomNumber = (int) (Math.random() * 1000);
            driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File before = screenshot.getScreenshotAs(OutputType.FILE);
            String fileName = "failedTest" + randomNumber + ".png";
            try {
                FileUtils.copyFile(before, new File("src/Test/resources/" + fileName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

            @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }


}

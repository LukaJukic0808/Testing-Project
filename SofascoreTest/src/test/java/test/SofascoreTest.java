package test;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SofascoreHomePage;
import pages.SofascorePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SofascoreTest {

    WebDriver driver;
    SofascoreHomePage sofascoreHomePage;
    Capabilities capabilities;
    String localHostURL = "http://localhost:4444/";


    @BeforeTest
    public void setup() throws MalformedURLException {
        capabilities = new ChromeOptions();
        driver = new RemoteWebDriver(new URL(localHostURL), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void goToHomePage(){
        driver.navigate().to(SofascorePage.sofascoreURL);
    }

    @Test
    public void testHomePage(){
        sofascoreHomePage = new SofascoreHomePage(driver);
        sofascoreHomePage.acceptCookies();
        sofascoreHomePage.checkCalendar();
        sofascoreHomePage.checkProfilePicture();
        sofascoreHomePage.checkTopLeagues();
        sofascoreHomePage.checkSettingsButton();
    }

    @AfterTest
    public void teardownTest() {
        driver.quit();
    }
}

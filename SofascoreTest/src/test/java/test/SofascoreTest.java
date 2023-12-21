package test;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SofascoreFavouritesPage;
import pages.SofascoreHomePage;
import pages.SofascoreFootballMatchSubPage;
import pages.SofascorePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SofascoreTest {

    WebDriver driver;
    SofascoreHomePage sofascoreHomePage;
    SofascoreFootballMatchSubPage sofascoreFootballMatchSubPage;
    SofascoreFavouritesPage sofascoreFavouritesPage;
    Capabilities capabilities;
    Wait<WebDriver> wait;
    String localHostURL = "http://localhost:4444/";


    @BeforeTest
    public void setup() throws MalformedURLException {
        capabilities = new ChromeOptions();
        driver = new RemoteWebDriver(new URL(localHostURL), capabilities);
        wait = new WebDriverWait(driver, 5);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void goToHomePage(){
        driver.navigate().to(SofascorePage.sofascoreURL);
    }

    @Test(priority = 1)
    public void testHomePage(){
        sofascoreHomePage = new SofascoreHomePage(driver);
        sofascoreHomePage.acceptCookies();
        sofascoreHomePage.checkCalendar();
        sofascoreHomePage.checkProfilePicture();
        sofascoreHomePage.checkTopLeagues();
        sofascoreHomePage.checkSettingsButton();
    }

    @Test(priority = 2)
    public void testFootballMatchSubPage(){
        sofascoreHomePage = new SofascoreHomePage(driver);
        sofascoreHomePage.clickFirstMatch();
        sofascoreFootballMatchSubPage = new SofascoreFootballMatchSubPage(driver);
        sofascoreFootballMatchSubPage.checkShowMoreButton();
        sofascoreFootballMatchSubPage.checkAboutTeamsBar();
        sofascoreFootballMatchSubPage.checkDetailsButton();
        sofascoreFootballMatchSubPage.checkLineupsButton();
        sofascoreFootballMatchSubPage.checkTeams(sofascoreHomePage.getHomeTeamName(), sofascoreHomePage.getAwayTeamName());
    }

    @Test(priority = 3)
    public void testFavouritesPage(){
        String homeTeamName = null;
        String awayTeamName = null;
        sofascoreHomePage = new SofascoreHomePage(driver);
        homeTeamName = sofascoreHomePage.getHomeTeamName();
        awayTeamName = sofascoreHomePage.getAwayTeamName();
        sofascoreHomePage.addToFavourites();
        sofascoreHomePage.clickFavourites();
        wait.until(d -> driver.getCurrentUrl().equalsIgnoreCase(SofascoreFavouritesPage.favouritesURL));
        driver.navigate().refresh(); //Sofascore shows favourites only after refresh
        sofascoreFavouritesPage = new SofascoreFavouritesPage(driver);
        sofascoreFavouritesPage.checkDeleteFinishedButton();
        sofascoreFavouritesPage.checkLeftSideBar();
        sofascoreFavouritesPage.checkNotificationSettingsButton();
        sofascoreFavouritesPage.checkTeams(homeTeamName, awayTeamName);
    }

    @AfterTest
    public void teardownTest() {
        driver.quit();
    }
}

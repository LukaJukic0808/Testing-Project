package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SofascoreFavouritesPage extends SofascorePage{

    public static String favouritesURL = sofascoreURL + "/favorites";
    @FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div/div[1]")
    WebElement LeftSideBar;
    @FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div/div[1]/a/div/div")
    WebElement NotificationSettingsButton;
    @FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div/div[2]/div/div[1]/div/div[2]/button")
    WebElement DeleteFinishedButton;
    @FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div/div[2]/div/div[4]/a/div/div/div[4]/div/div[1]/div[1]/bdi")
    WebElement HomeTeamName;
    @FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div/div[2]/div/div[4]/a/div/div/div[4]/div/div[1]/div[2]/bdi")
    WebElement AwayTeamName;

    public SofascoreFavouritesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void checkLeftSideBar() {
        Assert.assertTrue(LeftSideBar.isDisplayed());
    }

    public void checkNotificationSettingsButton(){
        Assert.assertTrue(NotificationSettingsButton.isDisplayed());
    }

    public void checkDeleteFinishedButton(){
        Assert.assertTrue(DeleteFinishedButton.isDisplayed());
    }

    public void checkTeams(String homeTeamName, String awayTeamName){
        Assert.assertEquals(homeTeamName, HomeTeamName.getText());
        Assert.assertEquals(awayTeamName, AwayTeamName.getText());
    }

}

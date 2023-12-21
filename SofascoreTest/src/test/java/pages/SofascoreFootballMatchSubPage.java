package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SofascoreFootballMatchSubPage extends SofascorePage {

    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[3]/div/div[1]/div/div[1]/div[2]/div/div[1]/div/a/div/div/bdi")
    WebElement HomeTeamNameMatchSubPage;
    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[3]/div/div[1]/div/div[1]/div[2]/div/div[3]/div/a/div/div/bdi")
    WebElement AwayTeamNameMatchSubPage;
    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[3]/div/div[1]/div/a/button")
    WebElement ShowMoreButton;
    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[3]/div/div[1]/div/div[3]/div/div/div/div[2]")
    WebElement LineupsButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[3]/div/div[1]/div/div[3]/div/div/div/div[1]")
    WebElement DetailsButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[3]/div/div[1]/div/div[3]")
    WebElement AboutTeamsBar;

    public SofascoreFootballMatchSubPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void checkShowMoreButton(){
        Assert.assertTrue(ShowMoreButton.isDisplayed());
    }

    public void checkAboutTeamsBar(){
        Assert.assertTrue(AboutTeamsBar.isDisplayed());
    }

    public void checkLineupsButton(){
        Assert.assertTrue(LineupsButton.isDisplayed());
    }

    public void checkDetailsButton(){
        Assert.assertTrue(DetailsButton.isDisplayed());
    }

    public void checkTeams(String homeTeamName, String awayTeamName){
        Assert.assertEquals(homeTeamName, HomeTeamNameMatchSubPage.getText());
        Assert.assertEquals(awayTeamName, AwayTeamNameMatchSubPage.getText());
    }

}

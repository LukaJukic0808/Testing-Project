package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SofascoreFootballTeamPage extends SofascorePage{

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div/div[1]/div[2]/h2")
    WebElement TeamName;

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/button/div/span/div/bdi")
    WebElement TeamLeague;

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div/div[1]/div[2]/div/span")
    WebElement TeamNation;

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[2]/div[3]")
    WebElement StatisticsTab;

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[2]/div[4]")
    WebElement TopPlayers;

    public SofascoreFootballTeamPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void checkTeamName(String teamName){
        Assert.assertTrue(teamName.equalsIgnoreCase(TeamName.getText()));
    }

    public void checkTeamNation(String teamNation){
        Assert.assertTrue(teamNation.equalsIgnoreCase(TeamNation.getText()));
    }

    public void checkTeamLeague(String teamLeague){
        Assert.assertTrue(teamLeague.equalsIgnoreCase(TeamLeague.getText()));
    }

    public void checkStatisticsTab(){
        Assert.assertTrue(StatisticsTab.isDisplayed());
    }

    public void checkTopPlayers(){
        Assert.assertTrue(TopPlayers.isDisplayed());
    }

}

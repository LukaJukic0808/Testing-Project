package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SofascoreFootballPlayerPage extends SofascorePage {

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div/div[1]/div[1]/div[2]/div/div[1]/div[2]/h2")
    WebElement PlayerName;

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div/div[1]/div[2]/div[1]/div[1]/a/div/div/div[1]")
    WebElement PlayerTeam;

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div/span")
    WebElement PlayerNationAcronym;

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div/div[1]/div[2]/div[3]")
    WebElement AttributeOverviewTab;

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div/div[2]/div[1]/div[5]")
    WebElement StatisticsTab;

    public SofascoreFootballPlayerPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void checkPlayerTeam(String teamName){
        Assert.assertTrue(teamName.equalsIgnoreCase(PlayerTeam.getText()));
    }

    public void checkPlayerNation(String playerNationAcronym){
        Assert.assertTrue(playerNationAcronym.equalsIgnoreCase(PlayerNationAcronym.getText()));
    }

    public void checkPlayerName(String playerName){
        Assert.assertTrue(playerName.equalsIgnoreCase(PlayerName.getText()));
    }

    public void checkStatisticsTab(){
        Assert.assertTrue(StatisticsTab.isDisplayed());
    }

    public void checkAttributeOverviewTab(){
        Assert.assertTrue(AttributeOverviewTab.isDisplayed());
    }

}

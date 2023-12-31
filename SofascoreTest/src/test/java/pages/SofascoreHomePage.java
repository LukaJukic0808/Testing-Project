package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SofascoreHomePage extends SofascorePage {

    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[2]/div/div[2]/div[2]/div[2]/a/div/div/div[1]")
    WebElement FirstMatch;

    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]")
    WebElement Calendar;

    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[1]/div[3]")
    WebElement TopLeagues;

    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[2]/div/div[2]/div[2]/div[2]/a/div/div/div[4]/div/div[1]/div[1]/bdi")
    WebElement HomeTeamName;

    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[2]/div/div[2]/div[2]/div[2]/a/div/div/div[4]/div/div[1]/div[2]/bdi")
    WebElement AwayTeamName;

    @FindBy(xpath = "/html/body/div[1]/main/div/div[1]/div[2]/div/div[2]/div[2]/div[2]/a/div/div/div[6]/div/div/button")
    WebElement AddToFavouritesButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]")
    WebElement ConsentCookiesButton;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/div/div[2]/div/div/div/div[1]/div/div[1]/a")
    WebElement FirstSearchResult;

    public SofascoreHomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void acceptCookies(){
        ConsentCookiesButton.click();
    }

    public void checkCalendar(){
        Assert.assertTrue(Calendar.isDisplayed());
    }

    public void checkTopLeagues(){
        Assert.assertTrue(TopLeagues.isDisplayed());
    }

    public void checkSettingsButton(){
        Assert.assertTrue(SettingsButton.isDisplayed());
    }

    public void checkProfilePicture(){
        Assert.assertTrue(ProfilePicture.isDisplayed());
    }

    public void addToFavourites(){
        AddToFavouritesButton.click();
    }

    public void clickFavourites(){
        Favourites.click();
    }

    public void clickFirstMatch(){
        FirstMatch.click();
    }

    public void inputSearchBar(String text){
        SearchBar.sendKeys(text);
    }

    public void clickFirstSearchResult(){
        FirstSearchResult.click();
    }

    public String getHomeTeamName(){
        return HomeTeamName.getText();
    }

    public String getAwayTeamName(){
        return AwayTeamName.getText();
    }

}

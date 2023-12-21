package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SofascorePage {

    public static String sofascoreURL = "https://www.sofascore.com";
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/div/div[3]/div/a[3]/button/img")
    WebElement ProfilePicture;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/div/div/div/div[2]/div/div/div/button")
    WebElement SettingsButton;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/div/div[2]/div/form/input")
    WebElement SearchBar;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/div/div[3]/div/a[2]/span")
    WebElement Favourites;

    public SofascorePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;

import java.awt.print.PageFormat;
import java.time.Duration;
import java.util.List;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));

    @FindBy(xpath = "(//*[@class='fc-button-label'])[1]")
    public WebElement constent;
    @FindBy(linkText = "Homes")
    public WebElement homes;

    @FindBy(xpath = "//*[@title='Canada']")
    public WebElement canada;

    @FindBy(xpath = "(//*[@href='#'])[1]")
    public WebElement signButton;

    @FindBy(xpath = "(//*[@href='#'])[3]")
    public WebElement register;

    @FindBy(id = "q")
    public WebElement searchBox;

    @FindBy(id = "text_search_button")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@class='picture']")
    public List <WebElement> pictures;


}

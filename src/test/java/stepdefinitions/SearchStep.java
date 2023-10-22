package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.DriverManager;

public class SearchStep {

    HomePage homePage = new HomePage(DriverManager.getDriver());
    @Given("User on waatwo sitee")
    public void userOnWaatwoSitee() {
        DriverManager.getDriver().get("https://www.waa2.com");
        homePage.canada.click();
    }


    @When("User click homes content")
    public void userClickHomesContent() {
      //  homePage.homes.click();
        //System.out.println(homePage.homes.getText());
    }

    @And("User searches {string}")
    public void userSearches(String key) {
      //  homePage.searchBox.sendKeys(key);
        //homePage.searchButton.click();
    }

    @Then("User see keyword")
    public void userSeeKeyword() {

      //  homePage.pictures.get(1).isDisplayed();
    }


}

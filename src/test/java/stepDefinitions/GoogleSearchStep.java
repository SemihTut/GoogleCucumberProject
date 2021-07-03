package stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.Scenario;

import io.cucumber.java8.En;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.GoogleMainPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.lang.annotation.Annotation;


public class GoogleSearchStep implements En {


    private GoogleMainPage googleMainPage=new GoogleMainPage();

    // Warning: Make sure the timeouts for hooks using a web driver are zero

    public GoogleSearchStep() {

        Given("^a web browser is opened in google home page$", () -> {
            googleMainPage.navigateToHomePage();
        });

        When("^the search phrase \"([^\"]*)\" is entered$", (String phrase) -> {
            googleMainPage.enterSearchPhrase(phrase);
        });
        Then("^results for \"([^\"]*)\" are shown$", (String phrase) -> {
            Assert.assertTrue(googleMainPage.pageTitleContains(phrase));
        });

    }

}

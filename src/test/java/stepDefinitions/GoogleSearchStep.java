package stepDefinitions;

import io.cucumber.java8.En;
import org.junit.Assert;
import pages.GoogleMainPage;



public class GoogleSearchStep implements En {

    private final GoogleMainPage googleMainPage=new GoogleMainPage();

    public GoogleSearchStep() {
        Given("^a web browser is opened in google home page$", googleMainPage::navigateToHomePage);
        When("^the search phrase \"([^\"]*)\" is entered$", googleMainPage::enterSearchPhrase);
        Then("^results for \"([^\"]*)\" are shown$", (String phrase) -> {
            Assert.assertTrue(googleMainPage.pageTitleContains(phrase));
        });

    }

}

package stepDefinitions;

import io.cucumber.java8.En;
import pages.GoogleMainPage;

public class WikipediaStepDefs implements En {

    public WikipediaStepDefs (){
        Given("^a web browser is opened in wikipedia home page$",GoogleMainPage::navigateToHomePage);
    }
}

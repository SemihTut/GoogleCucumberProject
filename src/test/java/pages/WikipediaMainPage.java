package pages;

import utilities.ConfigurationReader;
import utilities.Driver;

public class WikipediaMainPage extends BasePage{

    public void wikiHomePage(){
        Driver.get().get(ConfigurationReader.get("wiki_url"));
    }
}

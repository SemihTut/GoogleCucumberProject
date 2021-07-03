package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GoogleMainPage extends BasePage{

    private static final By SEARCH_FIELD = By.name("q");

    public void navigateToHomePage(){
        getDriver().get(ConfigurationReader.get("url"));
    }

    public void enterSearchPhrase(String phrase) {
        WebElement searchField = driverWait(10).until(ExpectedConditions.elementToBeClickable(SEARCH_FIELD));
        searchField.sendKeys(phrase);
        searchField.submit();
    }

    public boolean pageTitleContains(String phrase) {
        try {
            return driverWait(5).until(ExpectedConditions.titleContains(phrase));
        } catch (TimeoutException ex) {
            return false;
        }
    }
}

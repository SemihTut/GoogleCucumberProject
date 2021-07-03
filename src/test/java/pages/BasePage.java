package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public abstract class BasePage{

    WebDriver driver = Driver.get();

    public BasePage(){
        PageFactory.initElements(driver,this);
    }

    protected WebDriver getDriver(){
        return driver;
    }
    protected WebDriverWait driverWait(long timeoutSeconds) {
        return new WebDriverWait(getDriver(), timeoutSeconds);
    }
}

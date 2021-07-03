package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public abstract class BasePage{


    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    protected WebDriverWait driverWait(long timeoutSeconds) {
        return new WebDriverWait(Driver.get(), timeoutSeconds);
    }
}

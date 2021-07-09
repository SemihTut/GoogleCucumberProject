package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public enum WaitFactory {

    CLICKABLE,
    PRESENCE,
    VISIBILITY;

    public static WebElement performExplicitWait(WaitFactory waitStrategy, By by){

        WebElement element = null;
        if(waitStrategy == WaitFactory.CLICKABLE){
            element = new WebDriverWait(Driver.get(),5)
                    .until(ExpectedConditions.elementToBeClickable(by));
        }else if(waitStrategy==WaitFactory.PRESENCE){
            element = new WebDriverWait(Driver.get(),5)
                    .until(ExpectedConditions.presenceOfElementLocated(by));
        }else if(waitStrategy==WaitFactory.VISIBILITY){
            element = new WebDriverWait(Driver.get(),5)
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        return element;
    }

}

package gameArt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;
import utilities.Driver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.stream.Collectors;

public class GameArt {

    private final String gameName = "Ali Baba’s Riches";
    @Test
    public void test1() throws InterruptedException, AWTException {
        Driver.get().get("https://gameart.net/");
        Driver.get().manage().window().maximize();

        // to click games button in the header
        WebElement games = Driver.get().findElement(By.linkText("Games"));
        BrowserUtils.waitForVisibility(games,5);
        games.click();

        // to list all games webelements and click according to the games name
        List<WebElement> gamesList = Driver.get().findElements(By.className("game-cards__mobiletitle_long"));

        try {
            for(WebElement elo : gamesList){
                if(elo.getText().contains(gameName)){
                    elo.click();
                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        }

        // this part to click the play demo button
        WebElement playDemo = Driver.get().findElement(By.xpath("//a[contains(text(),'Play demo')]"));
        BrowserUtils.waitForVisibility(playDemo,5);
        BrowserUtils.clickWithJS(playDemo);

        // to wait the game begins
        Thread.sleep(20000);



        //
        Driver.get().switchTo().activeElement().click();
        Thread.sleep(1000);

        //robot class
        Robot robot = new Robot();
        // 750-700 spin button coordinates
       // robot.mouseMove(750,700);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.mouseMove(700,700);
        robot.keyRelease(KeyEvent.VK_SPACE);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);


        Thread.sleep(4000);
        Driver.closeDriver();

    }
}

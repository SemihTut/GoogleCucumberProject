package gameArt;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

@Getter
public enum Headers {

    PRODUCTS ("Product"),
    GAMES("Games"),
    ABOUT_US("About us"),
    CONTACT("Contact"),
    NEWS("News"),
    CLIENT_AREA("Client Area");

    private String linkText;
    private By locator;

    Headers(String linkText) {
        this.linkText = linkText;
        locator=By.linkText(linkText);
    }


}

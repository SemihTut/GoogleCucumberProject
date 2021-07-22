package gameArt;

import org.openqa.selenium.By;
import utilities.Driver;

import java.text.Format;

public class Formatss {


    public static void main(String[] args) {

        String str = "My name is %s";
        String name = "Semih";
        System.out.println(String.format(str, name));

        String semih = String.format("My name is %s", "semih");
        System.out.println("semih = " + semih);

        // some staff about string format
        String xpath = "//span[@class='%s']";

        Driver.get().findElement(By.xpath(String.format(xpath, name)));
    }
}

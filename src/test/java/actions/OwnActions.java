package actions;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OwnActions {

    private static Actions action = new Actions(DriverManager.getWebDriver());


    public static void mouseHover(WebElement element){
        action.moveToElement(element).build().perform();
    }

}

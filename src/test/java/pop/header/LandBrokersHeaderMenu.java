package pop.header;


import actions.OwnActions;
import driver.manager.DriverManager;
import logger.StepLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
    Class contain all header menu elements plus all methods which can be performed on them
 */


public class LandBrokersHeaderMenu {


    public LandBrokersHeaderMenu() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    public WebElement getFootball() {
        return football;
    }

    @FindBy(id = "menu-item-217550")
    private WebElement football;

    public void moveMouseTo(WebElement element) {
        OwnActions.mouseHover(element);
        StepLogger.setLoggerInfo("User move mouse to Football in header menu");
    }

}

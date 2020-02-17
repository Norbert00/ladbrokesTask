package pop;


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


    @FindBy(id = "menu-item-217550")
    private WebElement football;


    public LandBrokersHeaderMenu() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }



    public void moveMouseTo() {
        OwnActions.mouseHover(football);
        StepLogger.setLoggerInfo("User move mouse to Football in header menu");
    }

}

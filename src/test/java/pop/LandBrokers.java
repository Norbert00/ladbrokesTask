package pop;


import actions.OwnActions;
import driver.manager.DriverManager;
import logger.StepLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LandBrokers {



    @FindBy(id = "menu-item-217550")
    private WebElement football;

    public LandBrokers() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }



    public void moveMouseTo() {
        OwnActions.mouseHover(football);
        StepLogger.setLoggerInfo("User move mouse to Football in header menu");

    }

}

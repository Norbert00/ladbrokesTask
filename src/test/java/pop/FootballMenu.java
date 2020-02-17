package pop;

import driver.manager.DriverManager;
import logger.StepLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;


public class FootballMenu {

    public static final String EXPECTED_URL = "https://news.ladbrokes.com/football/premier-league";

    public WebElement getPremierLeague() {
        return premierLeague;
    }

    @FindBy(id="menu-item-222079")
    private WebElement premierLeague;




    public FootballMenu(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnPremierLeague(){
        WaitForElement.waitUntilElementIsVisible(premierLeague);
        premierLeague.click();
        StepLogger.setLoggerInfo("User clicked on the Premier League in Football menu");
    }

    public boolean isCorrectUrl(String url) {
        String pageUrl = DriverManager.getWebDriver().getCurrentUrl();
        if (pageUrl.equals(url)){
            StepLogger.setLoggerInfo("User has been redirect to page " + url);
            return true;
        }
        return false;
    }

}

package pop.header;

import driver.manager.DriverManager;
import logger.StepLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;


/*
    The class contains the elements of the football menu, plus the methods that can be performed on them,
    Menu appear when you hover your mouse over the Football in the header menu.
 */

public class FootballHeaderMenu {

    public static final String EXPECTED_URL = "https://news.ladbrokes.com/football/premier-league";

    @FindBy(id="menu-item-222079")
    private WebElement premierLeague;

    public WebElement getPremierLeague() {
        return premierLeague;
    }



    public FootballHeaderMenu(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnPremierLeague(WebElement element){
        WaitForElement.waitUntilElementIsVisible(element);
        element.click();
        StepLogger.setLoggerInfo("User clicked on the Premier League in Football menu");
    }

    public boolean isCorrectUrl(String url) {
        String pageUrl = DriverManager.getWebDriver().getCurrentUrl();
        boolean isCorrect;
        if (pageUrl.equals(url)){
            StepLogger.setLoggerInfo("User has been redirect to page " + url);
            isCorrect = true;
        } else {
            isCorrect = false;
            StepLogger.setLoggerInfo("User has been redirect to page " + url);
        }
        return isCorrect;
    }

}

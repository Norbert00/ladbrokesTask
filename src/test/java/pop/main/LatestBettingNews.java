package pop.main;

import driver.manager.DriverManager;
import logger.StepLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;
import java.util.List;



public class LatestBettingNews {


    public LatestBettingNews() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    private List<WebElement> allSeeMoreButtons = catchAllSeeMoreButtons();
    private List<WebElement> allBricksNews = catchAllBricksNews();

    public List<WebElement> getAllSeeMoreButtons() {
        return allSeeMoreButtons;
    }
    public List<WebElement> getAllBricksNews() {
        return allBricksNews;
    }


    private List<WebElement> catchAllBricksNews() {
        List<WebElement> list;
        list = DriverManager.getWebDriver().findElements(By.xpath("//div[@class='post-list-frame mobile-hidden cf']/div"));
        return list;
    }

    private List<WebElement> catchAllSeeMoreButtons() {
        List<WebElement> list;
        list = DriverManager.getWebDriver().findElements(By.xpath("//div[@class='see-more mobile-hidden cf']/div"));
        return list;
    }


    public void clickOnSeeMoreButton(int indexOfElement, List<WebElement> e) {
        switch (indexOfElement) {
            case 1:
                WaitForElement.waitUntilElementIsVisible(e.get(0));
                e.get(0).click();
                StepLogger.setLoggerInfo("User has clicked on the first See More button");
                break;
            case 2:
                WaitForElement.waitUntilElementIsVisible(e.get(1));
                e.get(1).click();
                StepLogger.setLoggerInfo("User has clicked on the second See More button");
                break;
            case 3:
                WaitForElement.waitUntilElementIsVisible(e.get(2));
                e.get(2).click();
                StepLogger.setLoggerInfo("User has clicked on the third See More button");
                break;
            default:
                System.out.println("Empty array");
        }
    }


    public boolean loadedNewsCheck(List<WebElement> e) {
        if (e.size() > 25) {
            StepLogger.setLoggerInfo("Bricks with news have been loaded ");
            return true;
        } else {
            StepLogger.setLoggerInfo("loadedNewsChecked failed");
            return false;
        }
    }

}





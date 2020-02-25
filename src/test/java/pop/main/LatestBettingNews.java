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


    private final List<WebElement> allSeeMoreButtons = catchAllSeeMoreButtons();
    private final List<WebElement> allBricksInLatestBettingSection = catchAllBricksNewsFromLatestBettingSection();


    public List<WebElement> getAllSeeMoreButtons() {
        return allSeeMoreButtons;
    }
    public List<WebElement> getAllBricksInLatestBettingSection() {
        return allBricksInLatestBettingSection;
    }


    private List<WebElement> catchAllBricksNewsFromLatestBettingSection() {
        List<WebElement> list;
        list = DriverManager.getWebDriver().findElements(By.xpath("//div[@data-sticky='6']//parent::div/div/div[@class='post-brick d-1of2 t-1of2 m-all']"));
        return list;
    }

    private List<WebElement> catchAllSeeMoreButtons() {
        List<WebElement> list;
        list = DriverManager.getWebDriver().findElements(By.xpath("//div[@class='see-more mobile-hidden cf']/div"));
        return list;
    }


//    public void clickOnSeeMoreButton(int indexOfElement, List<WebElement> elementInTheList) {
//        elementInTheList.get(indexOfElement - 1).click();
//        StepLogger.setLoggerInfo("User clicked on See More button " + indexOfElement);
//    }

    public void clickOnSeeMoreButton(int indexOfElement) {
        List<WebElement> e = getAllSeeMoreButtons();
        WaitForElement.waitUntilElementIsVisible(e.get(indexOfElement));
        e.get(indexOfElement - 1).click();
        StepLogger.setLoggerInfo("User clicked");
    }

    public boolean loadedNewsCheck(List<WebElement> listToCheck) {
        int sizeAfterClick = catchAllBricksNewsFromLatestBettingSection().size();
        boolean result;
        if (sizeAfterClick > listToCheck.size()) {
            StepLogger.setLoggerInfo("Bricks with news have been loaded ");
            result = true;
        } else {
            StepLogger.setLoggerInfo("Bricks with news have been loaded ");
            result = false;
        }
        return result;
    }



}





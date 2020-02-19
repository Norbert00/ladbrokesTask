package pop.main;

import driver.manager.DriverManager;
import logger.StepLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import waits.WaitForElement;

import java.util.List;


public class LatestBettingNews {


    public LatestBettingNews() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public List<WebElement> getSeeMoreButtons() {
        return seeMoreButtons;
    }

    private List<WebElement> seeMoreButtons = getAllSeeMoreButtons();

    // method which assign all see more buttons to the list of elements
    private List<WebElement> getAllSeeMoreButtons() {
        List<WebElement> list;
        list = DriverManager.getWebDriver().findElements(By.xpath("//*[@class='h3']"));
        return list;
    }

    // method allows to click on the chosen See More button
    public void clickOnSeeMoreButton(int numberOfTheButton, List<WebElement> elements) {
        switch (numberOfTheButton) {
            case 1:
                WaitForElement.waitUntilElementIsClickable(elements.get(0));
                elements.get(0).click();
                StepLogger.setLoggerInfo("User clicked on the first See more button");
                    break;
            case 2: elements.get(1).click();
                StepLogger.setLoggerInfo("User clicked on the second See more button");
                    break;
            case 3: elements.get(2).click();
                StepLogger.setLoggerInfo("User clicked on the third See more button");
                    break;
            case 4: elements.get(3).click();
                StepLogger.setLoggerInfo("User clicked on the fourth See more button");
                    break;
            case 5: elements.get(4).click();
                StepLogger.setLoggerInfo("User clicked on the fifth See more button");
                    break;
            case 6: elements.get(5).click();
                StepLogger.setLoggerInfo("User clicked on the sixth See more button");
                    break;
            default:
                System.out.println("No elements in the array");
                    break;
        }
    }


    public int getSizeOfElements() {
        return sizeOfElements;
    }

    private int sizeOfElements = listOfElement().size();

    private List<WebElement> listOfElement() {
        List<WebElement> list;
        list = DriverManager.getWebDriver().findElements(By.xpath("//*[@class='post-brick d-1of2 t-1of2 m-all']"));
        return list;
    }

    public boolean loadedElementInSectionBeetingNews() {
        if(getSizeOfElements() > 25) {
            return true;
        }else {
            return false;
        }
    }



}





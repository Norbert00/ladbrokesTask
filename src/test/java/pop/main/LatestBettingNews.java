package pop.main;

import driver.manager.DriverManager;
import logger.StepLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import waits.WaitForElement;


public class LatestBettingNews {


    public LatestBettingNews() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }



    @FindBy(xpath = "//div[@class='see-more mobile-hidden cf']/div")
    private WebElement seeMoreButton;

    @FindBy(xpath = "//a[@href='https://news.ladbrokes.com/football/kevin-doyle-on-the-premier-league-so-far-man-united-v-wolves-spurs-v-man-city.html']]")
    private WebElement loadedElement;


    public WebElement getSeeMoreButton() {
        return seeMoreButton;
    }

    public WebElement getLoadedElement() {
        return loadedElement;
    }


    public void clickOnSeeMoreButton(WebElement element) {
        WaitForElement.waitUntilElementIsVisible(element);
        StepLogger.setLoggerInfo("User click on the See more button in the Latest Betting News section");
        element.click();
    }

    public boolean isVisibleLoadedElement(WebElement element){
        boolean isVisible;
        if(WaitForElement.waitUntilElementIsVisible(element)) {
            isVisible = true;
        } else {
            isVisible = false;
        }
        return isVisible;
    }




//    public List<WebElement> getAllSeeMoreButtons() {
//        return DriverManager.getWebDriver().findElements(By.xpath("//div[@class='h3']"));
//    }
//    private List<WebElement> allSeeMoreButtons = getAllSeeMoreButtons();
//    public List<WebElement> someList = DriverManager.getWebDriver().findElements(By.xpath("//div[@class='widget-frame cf']//div//div[@class='see-more desktop-hidden cf']//div[@class='h3'][contains(text(),'See more')]"));





}





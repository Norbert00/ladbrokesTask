package waits;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static driver.manager.DriverManager.getWebDriver;

/*
    The class contains methods for implementing the WebDriverWait class
 */


public class WaitForElement {

    private static WebDriverWait getWebDriverWait() {
        return new WebDriverWait(getWebDriver(), 10);
    }

    public static boolean waitUntilElementIsVisible(WebElement element) {
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        return true;
    }

}

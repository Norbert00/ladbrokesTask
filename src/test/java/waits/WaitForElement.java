package waits;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static driver.manager.DriverManager.getWebDriver;

public class WaitForElement {

    private static WebDriverWait getWebDriverWait() {
        return new WebDriverWait(getWebDriver(), 10);
    }

    public static void waitUntilElementIsVisible(WebElement element) {
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

}

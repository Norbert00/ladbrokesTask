package driver.manager;

import logger.StepLogger;

public class DriverUtils {

    /*
    The class contains browser settings
    Enlarges the browser window and redirects to the specified URL
    */


    public static void setInitialConfiguration() {
        DriverManager.getWebDriver().manage().window().maximize();
    }

    public static void navigateToPage(String pageUrl) {
        DriverManager.getWebDriver().navigate().to(pageUrl);
        StepLogger.setLoggerInfo("User navigate to " + pageUrl);
    }

}

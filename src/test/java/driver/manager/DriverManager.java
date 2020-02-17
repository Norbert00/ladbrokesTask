package driver.manager;

import logger.StepLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;

    private DriverManager() {
    }

    public static WebDriver getWebDriver() {
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:/automation_tools/browser/chromedriver.exe");
            driver = new ChromeDriver();
            StepLogger.setLoggerInfo("Driver has been initialized");
        }
        return driver;
    }

    public static void disposeDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }

}

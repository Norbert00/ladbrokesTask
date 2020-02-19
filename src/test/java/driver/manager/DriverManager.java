package driver.manager;

import logger.StepLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    /*
    Class contain all settings of the driver
    Initializing the driver and closing the driver
    */



public class DriverManager {

    private static WebDriver driver;

    private DriverManager() {
    }

    public static WebDriver getWebDriver() {
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
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

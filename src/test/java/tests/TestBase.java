package tests;

import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static navigation.ApplicationURLs.APPLICATION_URL;

public class TestBase {

    /*
    The class that contains the basic settings of the driver
    The class is started before and after each test
    */


    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(APPLICATION_URL);
    }


    @AfterMethod
    public void afterTest(){
        DriverManager.disposeDriver();
    }
}

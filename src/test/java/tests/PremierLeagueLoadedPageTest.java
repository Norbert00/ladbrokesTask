package tests;


import org.testng.annotations.Test;
import pop.FootballMenu;
import pop.LandBrokers;

import static org.testng.Assert.assertTrue;
import static pop.FootballMenu.EXPECTED_URL;

public class PremierLeagueLoadedPageTest extends TestBase {




    @Test
    public void openBrowserWithCorrectUrlTest() {
        LandBrokers landBrokers = new LandBrokers();
        landBrokers.moveMouseTo();
        FootballMenu footballMenu = new FootballMenu();
        footballMenu.clickOnPremierLeague();

        assertTrue(footballMenu.isCorrectUrl(EXPECTED_URL));

    }




}

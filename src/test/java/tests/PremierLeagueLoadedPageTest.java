package tests;


import org.testng.annotations.Test;
import pop.FootballHeaderMenu;
import pop.LandBrokersHeaderMenu;
import static org.testng.Assert.assertTrue;
import static pop.FootballHeaderMenu.EXPECTED_URL;

public class PremierLeagueLoadedPageTest extends TestBase {



    @Test
    public void openPremierLeaguePageTest() {
        LandBrokersHeaderMenu landBrokersHeaderMenu = new LandBrokersHeaderMenu();
        landBrokersHeaderMenu.moveMouseTo();
        FootballHeaderMenu footballHeaderMenu = new FootballHeaderMenu();
        footballHeaderMenu.clickOnPremierLeague();

        assertTrue(footballHeaderMenu.isCorrectUrl(EXPECTED_URL));
    }




}

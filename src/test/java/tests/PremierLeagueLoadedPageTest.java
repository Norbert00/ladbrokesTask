package tests;


import org.testng.annotations.Test;
import pop.header.FootballHeaderMenu;
import pop.header.LandBrokersHeaderMenu;
import static org.testng.Assert.assertTrue;
import static pop.header.FootballHeaderMenu.EXPECTED_URL;

public class PremierLeagueLoadedPageTest extends TestBase {



    @Test
    public void openPremierLeaguePageTest() {
        LandBrokersHeaderMenu landBrokersHeaderMenu = new LandBrokersHeaderMenu();
        landBrokersHeaderMenu.moveMouseTo(landBrokersHeaderMenu.getFootball());
        FootballHeaderMenu footballHeaderMenu = new FootballHeaderMenu();
        footballHeaderMenu.clickOnPremierLeague(footballHeaderMenu.getPremierLeague());

        assertTrue(footballHeaderMenu.isCorrectUrl(EXPECTED_URL));
    }




}

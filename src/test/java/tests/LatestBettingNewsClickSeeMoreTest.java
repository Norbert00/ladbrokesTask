package tests;

import org.testng.annotations.Test;
import pop.main.LatestBettingNews;
import static org.testng.Assert.assertTrue;

public class LatestBettingNewsClickSeeMoreTest extends TestBase {


    @Test
    public void userClickSeeMoreButtonTest() {
        LatestBettingNews bettingNews = new LatestBettingNews();
        bettingNews.clickOnSeeMoreButton(1);

        assertTrue(bettingNews.loadedNewsCheck(bettingNews.getAllBricksInLatestBettingSection()));

    }


}

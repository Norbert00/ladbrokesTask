package tests;

import org.testng.annotations.Test;
import pop.main.LatestBettingNews;
import static org.testng.Assert.assertTrue;

public class LatestBettingNewsClickSeeMoreTest extends TestBase {


    @Test
    public void userClickSeeMoreButtonTest() {
        LatestBettingNews news = new LatestBettingNews();
        news.clickOnSeeMoreButton(news.getSeeMoreButton());

        assertTrue(news.isVisibleLoadedElement(news.getLoadedElement()));
    }


}

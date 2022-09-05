package PragmaticTests;

import PageObject.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestsPragmatic extends TestInit {

    @Test
    public void checkHeaderMenu() {

        HomePagePragmatic homePagePragmatic = new HomePagePragmatic(driver);

        openUrl("https://www.pragmaticplay.com/en/#");
        homePagePragmatic.closeBtnYes().click();
        homePagePragmatic.selectHomeBtn().get(0).click();
        homePagePragmatic.selectproductsBtn().click();
        homePagePragmatic.selectClientHubBtn().get(0).click();
        driver.navigate().back();
        homePagePragmatic.selectCompanyBtn().click();
        homePagePragmatic.selectNewsHubBtn().get(0).click();
        homePagePragmatic.selectContactBtn().get(0).click();
        homePagePragmatic.selectproductsBtn().click();
        homePagePragmatic.selectBingoBtn().click();

        Assert.assertTrue(homePagePragmatic.bingo().isDisplayed());
    }

    @Test
    public void checkBingoVariantsArentDuplicated() {

        HomePagePragmatic homePagePragmatic = new HomePagePragmatic(driver);

        openUrl("https://www.pragmaticplay.com/en/#");
        homePagePragmatic.closeBtnYes().click();
        homePagePragmatic.selectproductsBtn().click();
        homePagePragmatic.selectproductsBtn().click();
        homePagePragmatic.selectBingoBtn().click();
        homePagePragmatic.acceptAllBtn().click();

        List<String> result = new ArrayList<>();
        for (int k = 0; k < homePagePragmatic.slidesHidden().size() / homePagePragmatic.slidesActive().size(); k++) {
            for (int i = 0; i < homePagePragmatic.slidesActive().size(); i++)
                result.add(homePagePragmatic.slidesActive().get(i).getText());
            for (int h = 0; h < homePagePragmatic.slidesActive().size(); h++) {
                sleep(1);
                homePagePragmatic.goTo().click();
            }
        }

        System.out.println(result);
        for (int t = 0; t < result.size(); t++) {
            for (int r = 0; r < 9 - t; r++) {
                if (t != r)
                    Assert.assertNotEquals(result.get(t), result.get(r));
            }
        }
    }
}

package PragmaticTests;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HomePagePragmatic extends BasePage {

    public HomePagePragmatic(WebDriver driver) {
        super(driver);
    }

    public WebElement closeBtnYes() {
        return waitElementToBeClickable("//a[@data-age-check-confirm]");

    }

    public List<WebElement> selectHomeBtn() {
        return waitVisibilityOfAllElementsLocatedBy("//a[contains(text(),'Home')]");

    }

    public WebElement selectproductsBtn() {
        return waitElementToBeClickable("//a[contains(text(),'Products')]");
    }

    public List<WebElement> selectClientHubBtn() {
        return waitVisibilityOfAllElementsLocatedBy("//a[contains(text(),'Client Hub')]");
    }

    public WebElement selectCompanyBtn() {
        return waitElementToBeClickable("//a[contains(text(),'Company')]");
    }

    public List<WebElement> selectNewsHubBtn() {
        return waitVisibilityOfAllElementsLocatedBy("//a[contains(text(),'News')]");

    }

    public List<WebElement> selectContactBtn() {
        return waitVisibilityOfAllElementsLocatedBy("//a[contains(text(),'Contact')]");
    }

    public WebElement selectBingoBtn() {
        return waitElementToBeClickable("//a[contains(text(),'Bingo')]");
    }

    public WebElement bingo() {
        return waitElementToBeClickable("//h1[contains(text(),'Bingo')]");
    }

    public WebElement goTo() {
        return waitElementToBeClickable("//div[@class=right-arrow slick-arrow]");
    }

    public List<WebElement> slidesActive() {
        return waitVisibilityOfAllElementsLocatedBy("//div[contains(@class,'slick-slide') and @aria-hidden='false']//p");
    }

    public List<WebElement> slidesHidden() {
        return waitVisibilityOfAllElementsLocatedBy("//div[contains(@class,'slick-slide')]//p");
    }

    public WebElement acceptAllBtn() {
        return waitElementToBeClickable("//a[contains(text(),'Accept All')]");
    }
}


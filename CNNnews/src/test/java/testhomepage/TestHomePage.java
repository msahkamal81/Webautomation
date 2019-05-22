package testhomepage;

import base.CommonApi;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonApi {
    HomePage homePage;
    String url = "https://www.cnn.com/";

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }

    @Test
    public void clickOnBusiness() throws InterruptedException {
        homePage.clickOnBussiness();
    }
    @Test
    public void clickOnHealth() throws InterruptedException {
        homePage.clickOnHealth();
    }
    @Test
    public void clickOnPolitics() throws InterruptedException {
        homePage.clickOnPolitics();
    }



}

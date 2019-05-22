package homepage;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonApi {

    @FindBy(xpath = "(//a[contains(text(),'Business')])[1]")
    WebElement bussiness;

    @FindBy(xpath = "(//a[contains(text(),'Health')])[1]")
    WebElement health;

    @FindBy(xpath = "(//a[contains(text(),'Politics')])[1]")
    WebElement politics;

    public void clickOnBussiness() throws InterruptedException {

        if (bussiness.isDisplayed()) {
            Assert.assertTrue(true);
            bussiness.click();
            Thread.sleep(5);
        }
    }

    public void clickOnHealth() throws InterruptedException {

        if (health.isDisplayed()){
            Assert.assertTrue(true);
            health.click();
            Thread.sleep(5);
        }

    }
    public void clickOnPolitics() throws InterruptedException {
        if (politics.isDisplayed()){
            Assert.assertTrue(true);
            politics.click();
            Thread.sleep(5);
        }
    }



}

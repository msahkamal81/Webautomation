package homepage2;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage2 extends CommonApi {
    @FindBy(id = "nav-orders")
    WebElement orderTab;

    @FindBy(xpath =  "//a[@id='nav-hamburger-menu']")
    WebElement hamburger;
    @FindBy(id = "twotabsearchtextbox")
    WebElement inputSearch;

    public void setOrderTab(){

    }






}

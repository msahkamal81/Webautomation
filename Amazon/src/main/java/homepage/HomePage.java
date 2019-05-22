package homepage;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage extends CommonApi {

    @BeforeMethod
    public void reinit(){
        driver.get("https://learn.letskodeit.com/p/practice");
    }



    //@Test
    public void getTitle(){
        String str1 = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String str = driver.getTitle();
        Assert.assertEquals(str1,str);

    }

    @Test
    public void clickopenWindow() throws InterruptedException {

        Thread.sleep(5);
        driver.findElement(By.id("openwindow")).click();


    }
    @Test
    public void nameInput() throws InterruptedException {
        Thread.sleep(5);
        driver.findElement(By.name("enter-name")).sendKeys("kamal");
        Thread.sleep(5);
    }


}

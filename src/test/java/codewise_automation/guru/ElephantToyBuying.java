package codewise_automation.guru;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import utilities.Config;
import utilities.Driver;

public class ElephantToyBuying {
    @Before
    public void setUp() {
        Driver.getDriver().get(Config.getValue("guruBankUrl"));
    }


    @Test
    public void buyElephant() {
        Driver.getDriver().findElement(By.xpath("//input")).click();

        Driver.getDriver().findElement(By.name("card_nmuber")).sendKeys(Config.getValue("cardNumber"));

        Select select = new Select(Driver.getDriver().findElement(By.id("month")));
        select.selectByVisibleText(Config.getValue("expirationMonth"));


        Select select2 = new Select(Driver.getDriver().findElement(By.id("year")));
        select2.selectByVisibleText(Config.getValue("expirationYear"));

        Driver.getDriver().findElement(By.name("cvv_code")).sendKeys(Config.getValue("cvv"));

        Driver.getDriver().findElement(By.name("submit")).click();
    }


    @Test
    public void creditLimitTest() {
        Driver.getDriver().findElement(By.linkText("Check Credit Card Limit")).click();

        Driver.getDriver().findElement(By.id("card_nmuber")).sendKeys(Config.getValue("cardNumber") + Keys.ENTER);
        String firstTimeCardBalance = Driver.getDriver().findElement(By.xpath("//h4/span")).getText();

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

        Driver.getDriver().findElement(By.xpath("//input")).click();

        Driver.getDriver().findElement(By.name("card_nmuber")).sendKeys(Config.getValue("cardNumber"));

        Select select = new Select(Driver.getDriver().findElement(By.id("month")));
        select.selectByVisibleText(Config.getValue("expirationMonth"));


        Select select2 = new Select(Driver.getDriver().findElement(By.id("year")));
        select2.selectByVisibleText(Config.getValue("expirationYear"));

        Driver.getDriver().findElement(By.name("cvv_code")).sendKeys(Config.getValue("cvv"));

        Driver.getDriver().findElement(By.name("submit")).click();


        Driver.getDriver().findElement(By.linkText("Check Credit Card Limit")).click();

        Driver.getDriver().findElement(By.id("card_nmuber")).sendKeys(Config.getValue("cardNumber") + Keys.ENTER);
        String secondTimeCardBalance = Driver.getDriver().findElement(By.xpath("//h4/span")).getText();

        int firstTimeLimit = Integer.parseInt(firstTimeCardBalance);
        int secondTimeLimit = Integer.parseInt(secondTimeCardBalance);
        Assert.assertEquals(20, firstTimeLimit - secondTimeLimit);



    }

    @After
    public void tearDown() {
        Driver.quit();
    }

}

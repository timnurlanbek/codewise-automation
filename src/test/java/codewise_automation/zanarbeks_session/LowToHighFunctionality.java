package codewise_automation.zanarbeks_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LowToHighFunctionality {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();

        /*PseudoCode
        * Create new class and name it low to high functionality
        * create main method
        * launch the chrome browser and go to saucedemo
        * maximize the screen
        * login to the page
        * locate the drop-down and select low to high button
        * Inspect the all prices and copy the xpath for all prices in the web page
        * Create the list of webelements */


        WebElement userName = driver.findElement(By.id("user-name"));
        userName.click();
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("secret_sauce");


        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();


        WebElement dropDown = driver.findElement(By.className("product_sort_container"));
        Select option = new Select(dropDown);

        option.selectByValue("lohi");

        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));


        for (int i = 0; i < prices.size() -1; i++) {

            String tempPrice = prices.get(i).getText().replace("$","");
            double priceDouble = Double.parseDouble(tempPrice);

            String tempPriceNext = prices.get(i + 1).getText().replace("$","");
            double priceDoubleNext = Double.parseDouble(tempPriceNext);

            if (priceDouble <= priceDoubleNext){
                System.out.println("PASSED");
            }
            else {
                System.out.println("FAILED");
            }

        }




    }
}

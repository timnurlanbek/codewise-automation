package codewise_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://saucedemo.com");

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.click();
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("secret_sauce");


        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();


        WebElement firstAddCart = driver.findElement(By.id("(//div[@class='pricebar'])[1]/button"));
        firstAddCart.click();

        String text = firstAddCart.getText();
        if (text.equals("Remove")){
            System.out.println("Passed::");
        }
        else {
            System.out.println("Failed::");
        }


    }
}

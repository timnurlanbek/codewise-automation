package codewise_automation.actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Intro_To_Actions_Class {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        WebElement doubleClickButton = driver.findElement(By.id("dblClkBtn"));

        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton);
        actions.perform();

    }
}

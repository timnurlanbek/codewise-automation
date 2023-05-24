package codewise_automation.actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement link = driver.findElement(By.linkText("Selenium Sample Script"));
        WebElement text2 = driver.findElement(By.linkText("This is a link"));

        actions.clickAndHold(link).moveToElement(text2).perform();
    }
}

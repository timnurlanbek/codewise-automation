package codewise_automation.actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.*;

public class Scroll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        driver.manage().window().maximize();
        WebElement link = driver.findElement(By.linkText("Selenium Tutorial"));


        Actions actions = new Actions(driver);
        sleep(2000);

        actions.scrollByAmount(0,400).perform();
        actions.scrollByAmount(0,400).perform();
        actions.scrollByAmount(0,400).perform();
        actions.scrollByAmount(0,400).perform();
        actions.scrollByAmount(0,-400).perform();

    }
}

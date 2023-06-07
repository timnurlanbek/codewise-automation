package codewise_automation.timeOuts;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Cable {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/dynamic_controls?");
        driver.manage().window().maximize();
        WebElement input = driver.findElement(By.xpath("//form[@id='input-example']/input"));
        driver.findElement(By.xpath("//button[.='Enable']")).click();


        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.elementToBeClickable(input));

            input.sendKeys("1234567890");
            System.out.println("input passed");
        } catch (Exception e) {
            System.out.println("input failed");
        }




    }
}

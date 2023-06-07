package codewise_automation.timeOuts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class IntroToTimeOuts {



    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://etsy.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
        WebElement searchInput = driver.findElement(By.id("global-enhancements-search-query"));
        searchInput.sendKeys("Brecelete" + Keys.ENTER);



    }
}

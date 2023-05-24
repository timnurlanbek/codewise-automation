package codewise_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TemirTilla {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        search.click();

        Actions actions = new Actions(driver);
        actions.sendKeys(search,"temirtilla").perform();




        WebElement enterSearch = search.findElement(By.xpath("//button[@id='search-icon-legacy']/yt-icon"));
        enterSearch.click();

        try {
            WebElement temirTilla = driver.findElement(By.linkText("TiLLa"));
            temirTilla.click();
        }
        catch (Exception e){
            System.out.println("TemirTilla is not in the list");
            driver.quit();
        }


        WebElement video = driver.findElement(By.id("thumbnail"));
        video.click();


    }
}

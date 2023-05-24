package codewise_automation.window_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class IntroToWindowHandling {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        String mainPageID = driver.getWindowHandle();
        System.out.println("mainPageID = " + mainPageID);


        WebElement click = driver.findElement(By.id("opentab"));
        click.click();


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles.size());
        System.out.println(windowHandles);


        for (String id: windowHandles){
            if (!id.equals(mainPageID)){
                driver.switchTo().window(id);
                break;
            }
        }
        System.out.println( );
        System.out.println(driver.getCurrentUrl());

    }
}

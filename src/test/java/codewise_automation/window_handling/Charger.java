package codewise_automation.window_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Set;

public class Charger {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/");
        String zeroPage = driver.getWindowHandle();



        WebElement click = driver.findElement(By.linkText("PRACTICE"));
        click.click();
        String mainPage = driver.getWindowHandle();


        Set <String> Ids = driver.getWindowHandles();
        for (String secondId : Ids){
            if (!secondId.equals(mainPage)){
                driver.switchTo().window(secondId);

            }
        }




        WebElement allCourses = driver.findElement(By.id("opentab"));
        allCourses.click();
        String practicePage = driver.getWindowHandle();


        Set <String> windowHandles = driver.getWindowHandles();
        for (String thirdId : windowHandles){
            if (!thirdId.equals(mainPage) && !thirdId.equals(practicePage)){
                driver.switchTo().window(thirdId);
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        Thread.sleep(3000);

        driver.switchTo().window(practicePage);
        driver.close();

        Thread.sleep(2000);

        driver.switchTo().window(mainPage);
        driver.close();




    }
}
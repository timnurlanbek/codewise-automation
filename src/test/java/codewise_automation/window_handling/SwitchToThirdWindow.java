package codewise_automation.window_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchToThirdWindow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.letskodeit.com/");
        driver.manage().window().maximize();

        String mainPageId = driver.getWindowHandle();


        WebElement practice = driver.findElement(By.linkText("PRACTICE"));
        practice.click();

        Set <String> twoTabsId = driver.getWindowHandles();
        for (String practiceID : twoTabsId){
            if (!mainPageId.equals(practiceID)){
                driver.switchTo().window(practiceID);
            }
        }
        String practiceId = driver.getWindowHandle();


        WebElement allCourses = driver.findElement(By.id("opentab"));
        allCourses.click();

        Set <String> threeTabIds = driver.getWindowHandles();
        for (String allCoursesId : threeTabIds){
            if (!allCoursesId.equals(practiceId) && !allCoursesId.equals(mainPageId)){
                driver.switchTo().window(allCoursesId);
            }
        }
        String allCoursesID = driver.getWindowHandle();

        System.out.println("mainPageId = " + mainPageId);
        System.out.println("practiceId = " + practiceId);
        System.out.println("allCoursesID = " + allCoursesID);




        for (String handle : threeTabIds){
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("Practice Page")){
                break;
            }
        }
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());


    }
}

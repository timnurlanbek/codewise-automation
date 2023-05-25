package codewise_automation.iFrame;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase {


    /*
         Test for 3 ways to switch to iFrames
         1. Storing the iFrame web element and passing to it
         2. locating the names and ids of the iFrame
         3. Switching by index
        */

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("file:///Users/temirbeknurlanbekuulu/Desktop/myTest.html");
        System.out.println(driver.getWindowHandle());


        //WebElement blazeDemo = driver.findElement(By.className("travel"));
        /*driver.switchTo().frame(2);
        System.out.println(driver.getWindowHandle());

        try {
            driver.findElement(By.id("openwindows")).click();
            System.out.println("Openwindow clicked!");
        }
        catch (Exception e){
            System.err.println(("No such element"));
        }*/


        // By name or id


        /*try {
            driver.switchTo().frame("travels");
            driver.findElement(By.xpath("//span[@class='icon-bar'][1]")).click();
            System.out.println("Clicked");
        }
        catch (WebDriverException web){
            System.out.println("Not clicked. Couldn't find the web element!");
        }*/





        // By xpath

          WebElement xpath = driver.findElement(By.xpath("//iframe[@name='travel']"));
         driver.switchTo().frame(xpath);

         try {
             driver.findElement(By.xpath("//span[@class='icon-bar'][1]")).click();
             System.out.println("clicked");
         }
         catch(WebDriverException web){
             System.err.println("Cannot find the web Element");
         }





    }
}

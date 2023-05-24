package codewise_automation.actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Hover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        /*driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://artoftesting.com/sampleSiteForSelenium");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().window().maximize();*/
        Actions actions = new Actions(driver);



        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://artoftesting.com/sampleSiteForSelenium");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().window().maximize();








        List <WebElement> list = driver.findElements(By.xpath("//div[@id='primary-menu']/ul/li"));
        /*for (WebElement web :
                list) {
            actions.moveToElement(web).perform();
            Thread.sleep(2000);
        }*/


        for (int i = 0; i < list.size()-1; i++) {
            actions.moveToElement(list.get(i)).perform();
            Thread.sleep(1000);
        }


        /*WebElement hoverHome = driver.findElement(By.xpath("(//a[contains(text(),'Home')])[1]"));
        actions.moveToElement(hoverHome);
        actions.perform();

        Thread.sleep(2000);


        WebElement hoverOverHome = driver.findElement(By.xpath("(//a[contains(text(),'Manual')])[1]"));
        actions.moveToElement(hoverOverHome).perform();





        Thread.sleep(2000);


        WebElement hoverOverAutomation = driver.findElement(By.xpath("(//a[contains(text(),'Automation')])[1]"));
        actions.moveToElement(hoverOverAutomation).perform();





        Thread.sleep(2000);


        WebElement hoverOverPerformance = driver.findElement(By.xpath("(//a[contains(text(),'Performance')])[1]"));
        actions.moveToElement(hoverOverPerformance).perform();




        Thread.sleep(2000);


        WebElement hoverOverJava = driver.findElement(By.xpath("(//a[contains(text(),'Java')])[1]"));
        actions.moveToElement(hoverOverJava).perform();




        Thread.sleep(2000);


        WebElement hoverOverInterview = driver.findElement(By.xpath("(//a[contains(text(),'Interview')])[1]"));
        actions.moveToElement(hoverOverInterview).perform();



        Thread.sleep(2000);


        WebElement hoverOverBlog = driver.findElement(By.xpath("(//a[contains(text(),'Blog')])[1]"));
        actions.moveToElement(hoverOverBlog).perform();*/




    }
}

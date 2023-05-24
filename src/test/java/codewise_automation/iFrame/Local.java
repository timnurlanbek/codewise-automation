package codewise_automation.iFrame;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Local {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/temirbeknurlanbekuulu/Desktop/myTest.html");

        //driver.findElement(By.id("user-name")).sendKeys("james");

        List <WebElement> texts = driver.findElements(By.xpath("//h1"));
        System.out.println(texts.size()); // result: 1


        WebElement secondFrame = driver.findElement(By.xpath("//iframe[3]"));
        driver.switchTo().frame(secondFrame);

        /*driver.findElement(By.id("confirmbtn")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert message: " + alert.getText());
        alert.accept();*/



        WebElement coursesId = driver.findElement(By.id("courses-iframe"));
        driver.switchTo().frame(coursesId);
        System.out.println(driver.getTitle());

        Actions actions = new Actions(driver);


        Thread.sleep(4000);


        List <WebElement> hoverOver = driver.findElements(By.xpath("//div[@class='navbar-collapse collapse in']/ul[@class='nav navbar-nav pull-center dynamic_menu_texts']/li"));
        for (int i = 0; i < hoverOver.size(); i++) {
            actions.scrollToElement(hoverOver.get(i)).perform();
            Thread.sleep(3000);
        }





    }
}

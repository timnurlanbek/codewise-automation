package codewise_automation.zanarbeks_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TopSwagCode {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://topswagcode.com/xpath");
        WebElement input = driver.findElement(By.className("input-strobe"));
        input.click();
        input.sendKeys("//plate");

        WebElement enter = driver.findElement(By.className("enter-button"));
        enter.click();

        Thread.sleep(2000);
        input.click();
        input.sendKeys("//bento");
        enter.click();


        Thread.sleep(2000);
        input.click();
        input.sendKeys("//plate/apple");
        enter.click();


        Thread.sleep(2000);
        input.click();
        input.sendKeys("//*");
        enter.click();


        Thread.sleep(2000);
        input.click();
        input.sendKeys("//*/apple");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//plate[1]");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//plate/apple");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//*[@id='fancy']/pickle");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//*[contains(@class,'small')]");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//orange[contains(@class,'small')]");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//bento//orange[contains(@class,'small')]");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//plate| //bento");
        enter.click();




        Thread.sleep(2000);
        input.click();
        input.sendKeys("//plate/*");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//plate/following-sibling::apple");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//plate/preceding-sibling::pickle");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//pickle[2]");
        enter.click();




        Thread.sleep(2000);
        input.click();
        input.sendKeys("//plate/apple");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//plate/*[last()]");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//plate//apple[last()]");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//plate//apple[last()-1]");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//*[@for='Ethan'] | //*[@for='Alice'] | //*[@for='Clara']");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//plate[1] | //plate[2]");
        enter.click();



        Thread.sleep(2000);
        input.click();
        input.sendKeys("//bento[@for='Vitaly']");
        enter.click();




        Thread.sleep(2000);
        input.click();
        input.sendKeys("//plate[@id='fancy' and @for='Hanna']/apple");
        enter.click();


        Thread.sleep(2000);
        input.click();
        input.sendKeys("//*[starts-with(@for,'S')]");
        enter.click();


        Thread.sleep(2000);
        input.click();
        input.sendKeys("//*[substring(@for,string-length(@for)-string-length('ato')+1)='ato']");
        enter.click();


        Thread.sleep(2000);
        driver.quit();


    }
}

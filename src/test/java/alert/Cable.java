package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Cable {
    public static void main(String[] args) throws InterruptedException {



        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        driver.manage().window().maximize();


        String expectedAlertMessage = "Hi! Art Of Testing, Here!";


        WebElement dblClkBtn = driver.findElement(By.id("dblClkBtn"));
        Actions actions = new Actions(driver);

        actions.doubleClick(dblClkBtn).perform();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();

        if (alertMessage.equals(expectedAlertMessage)){
            System.out.println("Alert message: PASSED");
        }
        else {
            System.out.println("Alert message: FAILED");
        }







    }
}

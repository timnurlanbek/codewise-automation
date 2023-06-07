package codewise_automation.utilities_session;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.Flow;

import java.time.Duration;


public class Utilities {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        Faker faker = new Faker();
        WebElement input = driver.findElement(By.xpath("//input[@name='emailid']"));
        input.sendKeys(faker.internet().emailAddress() + Keys.ENTER);


        WebElement name = driver.findElement(By.xpath("//tr[4]/td[2]"));
        WebElement password = driver.findElement(By.xpath("//tr[5]/td[2]"));

        String name2 = name.getText();
        String password2 = password.getText();

        driver.findElement(By.linkText("Bank Project")).click();
        driver.findElement(By.name("uid")).sendKeys(name2);
        driver.findElement(By.name("password")).sendKeys(password2);
        driver.findElement(By.name("btnLogin")).sendKeys(Keys.ENTER);

        Flow.pause(800);

        String expectedUrl = "https://demo.guru99.com/V1/html/Managerhomepage.php";
        if (!driver.getCurrentUrl().equals(expectedUrl)) {
            System.out.println("Wrong URL");
        }
        else {
            System.out.println("Correct URL");
        }



    }
}

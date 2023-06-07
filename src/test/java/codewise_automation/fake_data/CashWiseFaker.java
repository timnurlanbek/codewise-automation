package codewise_automation.fake_data;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CashWiseFaker {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://codewise.academy/");
        driver.findElement(By.xpath("//button[@class='Button_button__Vx_l5 Header_btn__NfYSg']")).click();

        WebElement tel = driver.findElement(By.xpath("//input[@type='tel']"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement lastName = driver.findElement(By.id("last"));
        WebElement message = driver.findElement(By.id("message"));

        Faker faker = new Faker();
        tel.sendKeys(faker.phoneNumber().phoneNumber());
        email.sendKeys(faker.internet().emailAddress());
        lastName.sendKeys(faker.name().lastName());
        message.sendKeys(faker.lorem().sentence());
        driver.findElement(By.xpath("//button[@class='SendButton_sendButton__OAFSN']")).click();


    }
}

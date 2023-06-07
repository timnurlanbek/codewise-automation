package codewise_automation.utilities_session;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.Flow;

public class Test {
    public static void main(String[] args) {
        Faker Faker = new Faker();
        Driver.getDriver().get("https://www.youtube.com/");
        Driver.getDriver().findElement(By.xpath("//input[@id='search']")).sendKeys(Faker.lorem().sentence());









    }
}

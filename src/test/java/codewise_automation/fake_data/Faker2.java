package codewise_automation.fake_data;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Config;
import utilities.Driver;

public class Faker2 {
    public static void main(String[] args) {

        com.github.javafaker.Faker faker = new com.github.javafaker.Faker();
        String fakeName = faker.name().fullName();
        System.out.println("Fake Name: " + fakeName);
        System.out.println(faker.howIMetYourMother().quote());
        System.out.println(faker.address().city());
        System.out.println(faker.address().state());
        System.out.println(faker.address().zipCode());

        //mngr506030
        // :	rEmAvum

        String fakeUsername = "mngr506030";
        String fakePassword = "rEmAvum";
        System.out.println("Fake Username: " + fakeUsername);
        System.out.println("Fake Password: " + fakePassword);


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/");


        WebElement input = driver.findElement(By.xpath("//input[@name='emailid']"));
        input.sendKeys(faker.internet().emailAddress() + Keys.ENTER);


        WebElement name = driver.findElement(By.xpath("//tr[4]/td[2]"));
        WebElement password = driver.findElement(By.xpath("//tr[5]/td[2]"));

        System.out.println("name = " + name.getText());
        System.out.println("password = " + password.getText());




    }
}

package codewise_automation.zanarbeks_session;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;

public class FakerPracticeMyTestingThoughts {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Driver.getDriver().get("https://mytestingthoughts.com/Sample/home.html");
        Driver.getDriver().findElement(By.name("first_name")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.name("last_name")).sendKeys(faker.name().lastName());


        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//label[.='Gender']/../div/div"));

        WebElement maleRadio = Driver.getDriver().findElement(By.id("inlineRadioMale"));
        WebElement femaleRadio = Driver.getDriver().findElement(By.id("inlineRadioFemale"));

        int randomNumber = (int) (Math.random() * 2);  // Generates a random number between 0 and 1

        if (randomNumber == 0) {
            maleRadio.click();  // Select the male radio button
        } else {
            femaleRadio.click();  // Select the female radio button
        }



        Select select = new Select(Driver.getDriver().findElement(By.id("exampleFormControlSelect2")));

        int randomNumber2 = (int) (Math.random() * 5);  // Generates a random number between 0 and 1

        if (randomNumber2 == 0) {
            select.selectByVisibleText("Reading");  // Select the male radio button
        } else if (randomNumber2 == 1) {
            select.selectByVisibleText("Singing");  // Select the female radio
        }
        else if (randomNumber2 == 2) {
            select.selectByVisibleText("Swimming");  // Select the male radio button
        }
        else if (randomNumber2 == 3) {
            select.selectByVisibleText("Running");  // Select the female radio button
        }
        else if (randomNumber2 == 4) {
            select.selectByVisibleText("Jogging");  // Select the male radio button
        }




        Select select2 = new Select(Driver.getDriver().findElement(By.name("department")));
        int randomNumber3 = (int) (Math.random() * select2.getOptions().size());  // Generates a random number between 0 and 1
        select2.selectByIndex(randomNumber3);  // Select the male radio button


        Driver.getDriver().findElement(By.name("user_name")).sendKeys(faker.name().username());
        WebElement password = Driver.getDriver().findElement(By.name("user_password"));
        String faker2 = faker.internet().password();
        password.sendKeys(faker2);
        Driver.getDriver().findElement(By.name("confirm_password")).sendKeys(faker2);

        Driver.getDriver().findElement(By.name("email")).sendKeys(faker.internet().emailAddress());
        Driver.getDriver().findElement(By.name("contact_no")).sendKeys(faker.phoneNumber().cellPhone());
        Driver.getDriver().findElement(By.id("exampleFormControlTextarea1")).sendKeys(faker.lorem().sentence() + Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("//button")).click();

        String validation = Driver.getDriver().findElement(By.id("success_message")).getText();
        if (validation.equals("Success Success!.")) {
            System.out.println("Success!");
        }
        else {
            System.out.println("Failed!");
        }



    }
}

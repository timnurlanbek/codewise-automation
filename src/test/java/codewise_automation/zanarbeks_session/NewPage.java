package codewise_automation.zanarbeks_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NewPage {
    public static void main(String[] args) {

        /*WebDriver driver = new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo");

        WebElement dropDown = driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']"));
        dropDown.click();

        List <WebElement> dropDownMenues = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/*"));


        if (dropDownMenues.size()==2){
            System.out.println("Success!");
        }
        else {
            System.out.println("Fail!");
        }

        driver.quit();*/


        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo");
        driver.manage().window().maximize();


        WebElement myAccount = driver.findElement(By.xpath("//*[@class='dropdown-toggle']"));
        myAccount.click();

        WebElement register = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li/a"));
        register.click();


        WebElement inputFirstName = driver.findElement(By.id("input-firstname"));
        inputFirstName.sendKeys("Temirbek");


        WebElement inputLastName = driver.findElement(By.id("input-lastname"));
        inputLastName.sendKeys("Mother");

        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("tim@tim.com");

        WebElement inputTelephone = driver.findElement(By.id("input-telephone"));
        inputTelephone.sendKeys("61596442124321");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("tim123456");

        WebElement confirmPassword = driver.findElement(By.id("input-confirm"));
        confirmPassword.sendKeys("tim123456");

        WebElement ptichka = driver.findElement(By.xpath("//input[@type='checkbox']"));
        ptichka.click();

        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();

        WebElement continue1 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        continue1.click();
















        /*dropdown-toggle

        https://tutorialsninja.com/demo/index.php?route=account/register



        id = input-firstname

        id="input-lastname


                id="input-email"
                        id=input-telephone

                                input-password
                                        input-confirm
        //ptichka = input[@type='checkbox']
                                                submit=//input[@type='submit']*/

    }
}

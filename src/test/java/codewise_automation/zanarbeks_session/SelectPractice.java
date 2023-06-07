package codewise_automation.zanarbeks_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPractice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        driver.manage().window().maximize();

        int expectedAmountOfProducts = 4;
        int expectedAmountOfAnimals = 4;

        WebElement productSelect = driver.findElement(By.xpath("//select[@id='first']"));
        Select select = new Select(productSelect);

        int actualNumberOfProducts = select.getOptions().size();
        System.out.println(actualNumberOfProducts);

        if (actualNumberOfProducts == expectedAmountOfProducts){
            System.out.println("Number of products:: PASSED");
        }
        else {
            System.out.println("Number of products:: FAILED");
        }


        select.selectByVisibleText("Yahoo");



        WebElement animalSelect = driver.findElement(By.id("animals"));
        Select select2 = new Select(animalSelect);

        int actualNumberOfAnimal = select2.getOptions().size();


        if (expectedAmountOfAnimals == actualNumberOfAnimal){
            System.out.println("Number of Animals:: PASSED");
            select2.selectByVisibleText("Baby Cat");
        }
        else {
            System.out.println("Number of Animal:: FAILED");
        }







    }
}

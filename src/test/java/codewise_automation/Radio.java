package codewise_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        driver.manage().window().maximize();

        WebElement maleRadioButton = driver.findElement(By.id("male"));
        System.out.println("Before: " + maleRadioButton.isSelected());

        maleRadioButton.click();
        System.out.println( "After: " + maleRadioButton.isSelected());

        WebElement checkBox = driver.findElement(By.className("Automation"));
        checkBox.click();


        System.out.println("Before: " + checkBox.isSelected());



        // ---------------------------------


        WebElement femaleRadioButton = driver.findElement(By.id("female"));
        WebElement performanceCheckBox = driver.findElement(By.className("Performance"));

        femaleRadioButton.click();
        System.out.println("Female is selected: " + femaleRadioButton.isSelected());
        System.out.println("Male is selected: " + maleRadioButton.isSelected());


        System.out.println(maleRadioButton.getAttribute("type"));
        System.out.println(maleRadioButton.getAttribute("id"));
        System.out.println(maleRadioButton.getAttribute("class"));
        System.out.println(driver.getPageSource());


    }
}

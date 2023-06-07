package codewise_automation.zanarbeks_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Art {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        driver.manage().window().maximize();

        WebElement testingTypeDropDown = driver.findElement(By.id("testingDropdown"));

        Select testingTypes = new Select(testingTypeDropDown);
        String actualDefaultOption = testingTypes.getFirstSelectedOption().getText();
        String expectedDefaultOption = "Automation Testing";

        if (actualDefaultOption.equals(expectedDefaultOption)){
            System.out.println("Default Option:: PASSED");
        }
        else {
            System.out.println("Default Option:: FAILED");
        }


        List<WebElement> stringList = testingTypes.getOptions();
        for ( WebElement listOf : stringList) {
            System.out.println(listOf.getText());
        }



        // Select Manual Testing from options

        testingTypes.selectByVisibleText("Manual Testing");

    }
}

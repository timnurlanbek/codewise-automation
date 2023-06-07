package codewise_automation.zanarbeks_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Destination {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com");

        WebElement toPortDropDown = driver.findElement(By.xpath("//select[2]"));
        Select destinationCities = new Select(toPortDropDown);

        destinationCities.selectByVisibleText("Berlin");
        WebElement selected = destinationCities.getFirstSelectedOption();

        if (selected.getText().equals("Berlin")){
            System.out.println("Select functionality :: PASSED");
        }
        else {
            System.out.println("Select functionality :: FAILED");
        }


    }

}

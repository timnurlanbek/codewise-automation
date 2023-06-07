package codewise_automation.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com");
        driver.manage().window().maximize();

        WebElement fromPortDropDown = driver.findElement(By.xpath("//select[1]"));
        WebElement toPortDropDown = driver.findElement(By.xpath("//select[2]"));

        Select departureCities = new Select(fromPortDropDown);
        Select destinationCities = new Select(toPortDropDown);

        //Means, I have full access to interact with these two dropdowns

        String destinationDefaultValue = destinationCities.getFirstSelectedOption().getText();
        String departureDefaultValue = departureCities.getFirstSelectedOption().getText();

        System.out.println("destinationDefaultValue = " + destinationDefaultValue);
        System.out.println("departureDefaultValue = " + departureDefaultValue);

        List<WebElement> departuresCitiesAllOptions = departureCities.getOptions();
        System.out.println("All the options below::");
        for (WebElement option :
                departuresCitiesAllOptions) {
            System.out.println(option.getText());
        }

        List<String> expectedRequirement = new ArrayList<>();
        expectedRequirement.add("Paris");
        expectedRequirement.add("Philadelphia");
        expectedRequirement.add("Boston");
        expectedRequirement.add("Portland");
        expectedRequirement.add("San Diego");
        expectedRequirement.add("Mexico City");
        expectedRequirement.add("São Paolo");
        System.out.println("Below is expected one:");
        for (String s :
                expectedRequirement) {
            System.out.println(s);
        }


        if (departuresCitiesAllOptions.size() == expectedRequirement.size()){
            System.out.println("The amount of cities:: PASSED");
        }
        else {
            System.out.println("The amount of cities:: FAILED");
        }

        for (WebElement option :
                departuresCitiesAllOptions) {
            if (expectedRequirement.contains(option.getText())){
                System.out.println("City:: PASSED");
            }
            else {
                System.out.println("City:: FAiled");
            }
        }



        departureCities.selectByVisibleText("Boston");

        /*departureCities.selectByIndex(3);
        departureCities.selectByValue("Boston");*/



        System.out.println(departuresCitiesAllOptions.equals(expectedRequirement));








    }
}

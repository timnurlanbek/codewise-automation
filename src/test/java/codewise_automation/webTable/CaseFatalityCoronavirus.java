package codewise_automation.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class CaseFatalityCoronavirus {
    static WebDriver driver;

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("https://coronavirus.jhu.edu/data/mortality");
        List<WebElement> countries = driver.findElements(By.xpath("//td[@class='TRow_item__3DdbC']"));
        List<WebElement> percentages = driver.findElements(By.xpath("//tbody/tr/td[4]"));
        int counter = 0;
        for (int i = 0; i < countries.size(); i++) {
            String stringPercentages = percentages.get(i).getText().replace("%", "");
            double percentage = Double.parseDouble(stringPercentages);
            if (percentage <= 2) {
                System.out.println("Country name: " + countries.get(i).getText() + ": " + percentages.get(i).getText());
                counter++;
            }

        }

        if (counter > 0) {
            System.out.println("\n\n\nValidation passed");
        }
        else {
            System.out.println("\n\n\nValidation failed");
        }





    }
}

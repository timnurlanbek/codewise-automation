package codewise_automation.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class IntroToWebTable {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/reserve.php");

        WebElement ninetySix = driver.findElement(By.xpath("//tbody/tr[3]/td[2]"));

        if (ninetySix.getText().equals("9696")) {
            System.out.println("Ninety Six");
        }
        else {
            System.out.println("Not Ninety Six");
        }


        List<WebElement> rowsPrices = driver.findElements(By.xpath("//td[6]"));
        List<WebElement> rowsNumbers = driver.findElements(By.xpath("//td[2]"));

        List<String> expectedRowPrices = List.of(new String[]{"472.56", "432.98", "200.98", "765.3", "233.98"});

        for (WebElement row : rowsPrices) {
            if (!expectedRowPrices.contains(row.getText().substring(1))){
                System.out.println("Row not found");
            }
            else {
                System.out.println("Row found");
            }
        }

    }
}

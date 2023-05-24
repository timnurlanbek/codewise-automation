package zanarbeks_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestCases {
    public static void main(String[] args) {

        // double click with two clicks

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/");
        driver.manage().window().maximize();

        String mainPageId = driver.getWindowHandle();
        List<WebElement> elements = driver.findElements(By.xpath("//*"));
        System.out.println(elements.size());



        WebElement practice = driver.findElement(By.linkText("PRACTICE"));
        practice.click();
        practice.click();

        // result:  clicking two times repeatedly
        // * opening the same tab twice


    }
}

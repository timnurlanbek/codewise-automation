package zanarbeks_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Luma {

    public static void main(String[] args) throws InterruptedException {
        addToCartTees();
    }

    public static void addToCartTees() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        WebElement menButton = driver.findElement(By.xpath("//span[.='Men']"));
        menButton.click();
        Thread.sleep(2000);

        WebElement lumaTees = driver.findElement(By.xpath("(//span[.='Shop Tees'])[2]"));
        lumaTees.click();

        Thread.sleep(2000);
        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='column main']//li//span[@class='price']"));


        for (int i = 0; i < prices.size(); i++) {
            WebElement w = prices.get(i);
            String price = w.getText().substring(1);
            double printInt = Integer.parseInt(price);

            if (printInt >= 30) {

            }
        }
        }



    }

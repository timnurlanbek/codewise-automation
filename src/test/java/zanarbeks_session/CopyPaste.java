package zanarbeks_session;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class CopyPaste {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://wikipedia.org");
        String mainPageID = driver.getWindowHandle();

        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.click();
        searchInput.sendKeys("Muhammed Ali" + Keys.ENTER);


        Actions actions = new Actions(driver);
        WebElement ali = driver.findElement(By.xpath("//span[@class='mw-page-title-main']"));
        actions.doubleClick(ali).perform();
        actions.keyDown(Keys.COMMAND).sendKeys("a").sendKeys("c").perform();

        driver.navigate().to("https://wordcounter.net");

        Set<String> allTabs = driver.getWindowHandles();

        for (String secondTab : allTabs) {
            if (!secondTab.equals(mainPageID)){
                driver.switchTo().window(secondTab);
            }

        }

        WebElement boxInput = driver.findElement(By.id("box"));
        boxInput.click();

        actions.keyDown(Keys.COMMAND).sendKeys("v").perform();

        WebElement wordCounter = driver.findElement(By.xpath("//h1/span"));
        String sentence = wordCounter.getText();
        System.out.println(sentence);

        String expectedResult = "25,071 words 157,117 characters";

        if (expectedResult.equals(sentence)){
            System.out.println("Words and characters :: PASSED");
        }
        else {
            System.out.println("Words and characters :: FAILED");
        }








    }
}

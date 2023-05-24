package codewise_automation.window_handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class NewWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");

        driver.switchTo().newWindow(WindowType.TAB).get("https://instagram.com");

        driver.switchTo().newWindow(WindowType.TAB).get("https://google.com");

        driver.switchTo().newWindow(WindowType.TAB).get("https://microsoft.com");



        Set<String> windowHandles = driver.getWindowHandles();

        for (String Id : windowHandles){
            driver.switchTo().window(Id);
            String title = driver.getTitle();
            if (title.contains("youtube")){
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
    }
}

package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cashwise {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        String requiredTitle = "Cashwise is best";
        String expectedCashwiseUrl = "https://cashwise.us/main";

        driver.get("https://cashwise.us");
        driver.manage().window().fullscreen();

        System.out.println(driver.getTitle());
        if (requiredTitle.equals(driver.getTitle())){
            System.out.println("Cashwise title: PASSED");
        }
        else {
            System.out.println("Cashwise title: FAILED");
        }

        if (expectedCashwiseUrl.equals(driver.getCurrentUrl())){
            System.out.println("Cashwise URL: PASSED");
        }
        else {
            System.out.println("Cashwise URL: FAILED");
        }
        System.out.println(driver.getPageSource());
    }
}

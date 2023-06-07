package codewise_automation.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class ImdbSite {

    static WebDriver driver;
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("https://www.imdb.com/chart/top");

        driver.manage().window().maximize();
        movieRatingSearch(8,9);

    }




    public static void movieRatingSearch(int low, int high) {
        List<WebElement> movies = driver.findElements(By.xpath("//div[@class='lister']/table/thead/tr/th"));
        for (WebElement movie : movies){
            System.out.print(movie.getText() + "____");
        }

        System.out.println("\n");




        List<WebElement> titles = driver.findElements(By.xpath("//div[@class='lister']/table/tbody/tr/td[2]/a"));
        List<WebElement> ratings = driver.findElements(By.xpath("//div[@class='lister']/table/tbody/tr/td[3]"));
        int count = 0;
        for (int i = 0; i < titles.size(); i++) {
            double parseDouble = Double.parseDouble(ratings.get(i).getText());
            if (parseDouble >= low && parseDouble <= high) {
                System.out.println(titles.get(i).getText() + " : " + ratings.get(i).getText());
                count++;

            }
        }


        System.out.println("\t\nThe number of movies: " + count);


    }
}

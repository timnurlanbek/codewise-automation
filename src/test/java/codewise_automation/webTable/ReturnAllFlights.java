package codewise_automation.webTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;


public class ReturnAllFlights {

    public static WebDriver driver;


    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("https://www.blazedemo.com/reserve.php");
        driver.manage().window().maximize();

        flightInfoFormat2(200,400);


    }


    public static void flightInfoFormat (int flightNumber){
        List<WebElement> flightInfoElements = driver.findElements(By.xpath("//td[.='"+flightNumber+"']/../td"));

        try {
            WebElement flightInfo = driver.findElement(By.xpath("//td[.='" + flightNumber + "']"));
            if (flightInfo!= null) {
                for (WebElement flightInfoElement : flightInfoElements) {
                    System.out.println(flightInfoElement.getText());
                }
            }
            else {
                System.out.println("Not found flight with");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }



    public static void flightInfoFormat2 (int from, int to) {

        List <WebElement>  prices = driver.findElements(By.xpath("//tbody/tr/td[6]"));
        List <WebElement>  header = driver.findElements(By.xpath("//thead/tr/th"));

        for (int i = 0; i <= prices.size(); i++) {
            String priceString = prices.get(i).getText().replace("$", "");
            double parseDouble = Double.parseDouble(priceString);

            //List <WebElement>  allInfo = driver.findElements(By.xpath("//tbody/tr/td[.='$"+parseDouble+"']/.."));
           // if (parseDouble >= from && parseDouble <= to) {
                            System.out.print(header.get(i).getText());
                            //System.out.println(allInfo.get(i).getText());
                        //}


            /*System.out.println(header.get(i).getText());
            System.out.println("\n\n");*/
            //System.out.println(allInfo.get(i).getText());




            }
        }










    public static List <WebElement> findFlights (double beginningPrice, double endingPrice){
        List<WebElement> finalResult = new ArrayList<>();
        List<WebElement> flightsPrices = driver.findElements(By.xpath("//tbody/tr/td[6]"));

        for (WebElement element : flightsPrices) {
            String priceString = element.getText().replace("$", "");
            double parseDouble = Double.parseDouble(priceString);

            if (parseDouble >= beginningPrice && parseDouble <= endingPrice) {
                String xpath = "//tbody/tr//td[.='$" + parseDouble + "']/../td[2]";
                WebElement flight = driver.findElement(By.xpath(xpath));
                finalResult.add(flight);

            }
        }

        return finalResult;
    }
}

package codewise_automation.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Config;
import utilities.Driver;
import utilities.Flow;

public class GuruBankLogin {
    public static void main(String[] args) {
        Driver.getDriver().get(Config.getValue("guruBankUrl"));
        Driver.getDriver().findElement(By.xpath("//nav[@id='nav']/a[2]")).click();

        Flow.switchToSecondWindow();

        WebElement limit = Driver.getDriver().findElement(By.xpath("//h4[@style='text-align:center;font-size:24px;font-weight:400;color:#555;line-height:36px;'][4]/span"));
        WebElement numbers = Driver.getDriver().findElement(By.xpath("//h4[@style='text-align:center;font-size:24px;font-weight:400;color:#555;line-height:36px;'][1]"));
        WebElement cvv = Driver.getDriver().findElement(By.xpath("//h4[@style='text-align:center;font-size:24px;font-weight:400;color:#555;line-height:36px;'][2]"));


        String limitString = limit.getText().replace("$","");
        double limit2 = Double.parseDouble(limitString);
        if (limit2 == 100.00) {
            System.out.println("Number is 100.00");
        }
        else {
            System.out.println("Number is not 100.00");
        }



        String longNumberString2 = numbers.getText().substring(14);
        if (longNumberString2.length() == 16) {
            System.out.println("Number is 16 digits");
        }
        else {
            System.out.println("Number is not 16 digits");
        }



        String cvvString = cvv.getText().substring(6);
        if (cvvString.length() == 3) {
            System.out.println("CVV is 3 digits");
        }
        else {
            System.out.println("CVV is not 3 digits");
        }


    }
}

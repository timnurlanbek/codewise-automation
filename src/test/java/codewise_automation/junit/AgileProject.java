package codewise_automation.junit;
import codewise_automation.pages.GuruAgileProjectPage;
import codewise_automation.pages.GuruHomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.Config;
import utilities.Driver;
import utilities.Flow;

public class AgileProject {

    GuruHomePage guruHomePage = new GuruHomePage();
    GuruAgileProjectPage agileProject = new GuruAgileProjectPage();
    @Before
    public void setUp() {
        Driver.getDriver().get("https://demo.guru99.com");


    }

    @Test
    public void loginTest() {
        Driver.getDriver().navigate().to("https://demo.guru99.com/Agile_Project/Agi_V1/");

        String username_text = Driver.getDriver().findElement(By.xpath("//div/ol/li[1]")).getText().substring(9);
        String password_text = Driver.getDriver().findElement(By.xpath("//div/ol/li[2]")).getText().substring(11);

        Driver.getDriver().findElement(By.name("uid")).sendKeys(username_text);
        Driver.getDriver().findElement(By.name("password")).sendKeys(password_text);
        Driver.getDriver().findElement(By.name("btnLogin")).click();

    }
    @Test
    public void logoutTest() throws InterruptedException {
        Driver.getDriver().navigate().to("https://demo.guru99.com/Agile_Project/Agi_V1/");

        String username_text = Driver.getDriver().findElement(By.xpath("//div/ol/li[1]")).getText().substring(9);
        String password_text = Driver.getDriver().findElement(By.xpath("//div/ol/li[2]")).getText().substring(11);

        Driver.getDriver().findElement(By.name("uid")).sendKeys(username_text);
        Driver.getDriver().findElement(By.name("password")).sendKeys(password_text);
        Driver.getDriver().findElement(By.name("btnLogin")).click();


        Driver.getDriver().findElement(By.xpath("//a[.='Log out']")).click();

        Alert alert = Driver.getDriver().switchTo().alert();
        String alertMessage = alert.getText();
        alert.accept();
        Flow.pause(400);
        Assert.assertEquals("UnmatchedURL", "https://demo.guru99.com/Agile_Project/Agi_V1/index.php",Driver.getDriver().getCurrentUrl());

    }

    @Test
    public void pomTest(){
        Driver.getDriver().get(Config.getValue("guruHomePageURL"));
        guruHomePage.agileHomePage.click();

        String username_text = agileProject.usernameAccess.getText().substring(9);
        String password_text = agileProject.passwordAccess.getText().substring(11);
        agileProject.usernameInput.sendKeys(username_text);
        agileProject.passwordInput.sendKeys(password_text);
        agileProject.loginButton.click();
        Flow.pause(400);
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php";
        Assert.assertEquals("URL unmathced", expectedUrl, currentUrl);
    }
    @Test
    public void logoutPom(){
        Driver.getDriver().get(Config.getValue("guruHomePageURL"));
        guruHomePage.agileHomePage.click();
        String username_text = agileProject.usernameAccess.getText().substring(9);
        String password_text = agileProject.passwordAccess.getText().substring(11);
        agileProject.login(username_text, password_text);
        agileProject.logoutButton.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        String alertMessage = alert.getText();
        alert.accept();
        String expectedAlertMessage = "You Have Succesfully Logged Out!!";
        Assert.assertEquals(expectedAlertMessage, alertMessage);
    }
}

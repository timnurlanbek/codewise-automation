package codewise_automation.zanarbeks_session.sauce_demo.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class SauceDemoLoginPom {

    public SauceDemoLoginPom(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (id = "user-name")
    public WebElement username;


    @FindBy (id = "password")
    public WebElement password2;

    @FindBy(xpath = "//div[@id='login_credentials']/h4")
    public WebElement standard_user_text;

    @FindBy(xpath = "//div[@class='login_password']/h4")
    public WebElement password_text;
}

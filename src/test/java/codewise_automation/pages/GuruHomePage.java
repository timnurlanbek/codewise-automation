package codewise_automation.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuruHomePage {
    public GuruHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Bank Project")
    public WebElement guruHomePage;


    @FindBy(linkText = "Insurance Project")
    public WebElement insuranceHomePage;

    @FindBy(name = "btnLogin")
    public WebElement loginBtn;

    @FindBy(linkText = "Agile Project")
    public WebElement agileHomePage;
}

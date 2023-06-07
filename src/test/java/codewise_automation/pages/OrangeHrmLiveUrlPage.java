package codewise_automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeHrmLiveUrlPage {
    public OrangeHrmLiveUrlPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div/p[.='Username : Admin']")
    public WebElement usernameAccess;

    @FindBy (xpath = "//div/p[.='Password : admin123']")
    public WebElement passwordAccess;

    @FindBy(partialLinkText = "Login")
    public WebElement loginButton;

    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;



    public void clickLoginButton(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        passwordInput.submit();
    }
}

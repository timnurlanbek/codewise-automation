package codewise_automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuruAgileProjectPage {
    public GuruAgileProjectPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "uid")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(name = "btnLogin")
    public WebElement loginButton;

    @FindBy(name = "btnReset")
    public WebElement resetButton;


    @FindBy(xpath = "//div/ol/li[1]")
    public WebElement usernameAccess;

    @FindBy(xpath = "//div/ol/li[2]")
    public WebElement passwordAccess;

    @FindBy(linkText = "Log out")
    public WebElement logoutButton;

    public void login(String userID, String password) {
        usernameInput.sendKeys(userID);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


    public void logout() {

    }
}

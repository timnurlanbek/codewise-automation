package codewise_automation.zanarbeks_session.orange_live_login;

import codewise_automation.pages.OrangeHrmLiveUrlPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utilities.Config;
import utilities.Driver;

public class OrangeHrmLiveLogin {
    OrangeHrmLiveUrlPage orangeHrmLiveUrlPage = new OrangeHrmLiveUrlPage();

    @Before
    public void openUrl() {
        Driver.getDriver().get(Config.getValue("orangeHrmLiveURL"));
    }

    @Test
    public void login() {
        String usernameText = orangeHrmLiveUrlPage.usernameAccess.getText().substring(11);
        String passwordText = orangeHrmLiveUrlPage.passwordAccess.getText().substring(11);
        orangeHrmLiveUrlPage.clickLoginButton(usernameText,passwordText);

        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}

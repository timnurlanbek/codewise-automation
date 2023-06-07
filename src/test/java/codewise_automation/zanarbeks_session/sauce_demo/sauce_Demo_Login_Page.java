package codewise_automation.zanarbeks_session.sauce_demo;

import codewise_automation.zanarbeks_session.sauce_demo.pages.SauceDemoLoginPom;
import com.github.javafaker.Faker;
import org.junit.Before;
import org.junit.Test;
import utilities.Config;
import utilities.Driver;

public class sauce_Demo_Login_Page {
    static Faker faker = new Faker();

    @Before
    public void setUp(){
        Driver.getDriver().get("https://www.saucedemo.com/");
    }
    @Test
    public void happyPath(){


    }
}

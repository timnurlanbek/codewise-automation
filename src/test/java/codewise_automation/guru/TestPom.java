package codewise_automation.guru;

import codewise_automation.pages.GuruHomePage;
import org.junit.Test;

public class TestPom {
    @Test
    public void mainTest() {
        GuruHomePage guruHomePage = new GuruHomePage();
        guruHomePage.insuranceHomePage.click();
    }
}

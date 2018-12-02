package actions;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.DriverManager;

public class FacebookLoginPage extends BasePage {

    @Step
    public LoginPage returnToLoginPageFromFacebookPage() {
        waitClickable(By.id("m_login_email")).sendKeys("gfgfdsgf");
        DriverManager.getDriver().navigate().back();
        DriverManager.getDriver().navigate().back();
        return new LoginPage();
    }
}

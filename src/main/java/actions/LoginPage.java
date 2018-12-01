package actions;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.DriverManager;

public class LoginPage extends BaseActions{

    @Step
    public LoginPage loginViaFacebook() {
        waitClickable(By.id("com.reachout:id/bFacebook")).click();
        return this;
    }

    @Step
    public LoginPage loginViaGoogle() {
        waitClickable(By.id("com.reachout:id/bGoogle")).click();
        return this;
    }

    @Step
    public LoginPage returnToLoginPageFromFacebook() {
        waitClickable(By.id("m_login_email")).sendKeys("gfgfdsgf");
        DriverManager.getDriver().navigate().back();
        DriverManager.getDriver().navigate().back();
        return this;
    }

    @Step
    public LoginPage returnToLoginPageFromGoogle() {
        waitClickable(By.id("identifierId")).sendKeys("hgdg");
        DriverManager.getDriver().navigate().back();
        return this;
    }

    @Step
    public LoginPage checkHeaders() {
        softAssert.assertTrue(waitVisible(By.id("com.reachout:id/tvSocialConnect"))
                .getText().equals("Social connect:"));
        softAssert.assertTrue(waitVisible(By.id("com.reachout:id/tvEmailConnect"))
                .getText().equals("Email connect:"));
        return this;
    }

    public LoginPage assertAll() {
        softAssert.assertAll();
        return this;
    }

}

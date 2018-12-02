package actions;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.DriverManager;

public class GoogleLoginPage extends BasePage {

    @Step
    public LoginPage returnToLoginPageFromGooglePage() {
        waitClickable(By.id("identifierId")).sendKeys("hgdg");
        DriverManager.getDriver().navigate().back();
        DriverManager.getDriver().navigate().back();
        return new LoginPage();
    }
}

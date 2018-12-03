package actions;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.DriverManager;

public class LoginPage extends BasePage{

    @Step
    public EmailLoginPage loginViaEmail() {
        elementWithXpath("/hierarchy//android.widget.TextView[contains(@text,'Email Login')]").click();
        return new EmailLoginPage();
    }


}

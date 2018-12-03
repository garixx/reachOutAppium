package actions;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.DriverManager;

public class LoginPage extends BasePage{

    @Step
    public EmailLoginPage loginViaEmail() {
        elementWithId("com.reachout:id/bEmailLogin").click();
        return new EmailLoginPage();
    }

}

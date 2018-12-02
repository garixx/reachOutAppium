package actions;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.DriverManager;

public class EmailSignUpPage extends BasePage {

    @Step
    public LoginPage returnToLoginPageFromEmailSignupPage() {
        waitClickable(By.id("com.reachout:id/bBack")).click();
        return new LoginPage();
    }
}

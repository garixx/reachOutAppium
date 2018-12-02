package actions;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class EmailLoginPage extends BasePage {

    @Step
    public LoginPage returnToLoginPageFromEmailLoginPage() {
        waitClickable(By.id("com.reachout:id/bBack")).click();
        return new LoginPage();
    }

    @Step
    public EmailLoginPage verifyPage() {
        id("com.reachout:id/tvLogin").shouldHave("Login to ReachOut");
        id("com.reachout:id/etEmail").shouldHave("Emailee");
        id("com.reachout:id/etPassword").shouldHave("Password");
        id("com.reachout:id/bEmailLogin").shouldHave("Login");
        return this;
    }
}

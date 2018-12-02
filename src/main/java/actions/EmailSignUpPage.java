package actions;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.DriverManager;

public class EmailSignUpPage extends BasePage {

    @Step
    public LoginPage returnToLoginPageFromEmailSignupPage() {

        id("com.reachout:id/etFirstName").shouldHave("First Name");
        id("com.reachout:id/etLastName").shouldHave("Last Name");
        id("com.reachout:id/etEmail").shouldHave("Email");
        id("com.reachout:id/etPassword").shouldHave("Password (min. 6 characters)");
        DriverManager.getDriver().hideKeyboard();
        id("com.reachout:id/etBirthday").shouldHave("Date of Birth");
        waitClickable(By.id("com.reachout:id/bBack")).click();
        return new LoginPage();
    }
}

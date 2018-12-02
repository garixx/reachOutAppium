package actions;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.DriverManager;

public class LoginPage extends BasePage{

    @Step
    public FacebookLoginPage loginViaFacebook() {
        waitClickable(By.id("com.reachout:id/bFacebook")).click();
        return new FacebookLoginPage();
    }

    @Step
    public GoogleLoginPage loginViaGoogle() {
        waitClickable(By.id("com.reachout:id/bGoogle")).click();
        return new GoogleLoginPage();
    }

    @Step
    public EmailLoginPage loginViaEmail() {
        waitClickable(By.id("com.reachout:id/bEmailLogin")).click();
        return new EmailLoginPage();
    }

    @Step
    public EmailSignUpPage signUpViaEmail(){
        waitClickable(By.id("com.reachout:id/bEmailSignup")).click();
        return new EmailSignUpPage();
    }

    @Step
    public LoginPage checkHeaders() {
        id("com.reachout:id/tvSocialConnect").shouldHave("Social connect:");
        id("com.reachout:id/tvEmailConnect").shouldHave("Email connect:");
        return this;
    }

}

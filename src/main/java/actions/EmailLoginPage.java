package actions;

import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

public class EmailLoginPage extends BasePage {

    @Step
    public LoginPage returnToLoginPageFromEmailLoginPage() {
        waitClickable(By.id("com.reachout:id/bBack")).click();
        return new LoginPage();
    }

    @Step
    public EmailLoginPage verifyPage() {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(new MobileBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.reachout:id/bEmailLogin\")")));
        id("com.reachout:id/tvLogin").shouldHave("Login to ReachOut");
        id("com.reachout:id/etEmail").shouldHave("Email");
        id("com.reachout:id/etPassword").shouldHave("Password");
        id("com.reachout:id/bEmailLogin").shouldHave("Login");
        return this;
    }

    @Step
    public MainPage loginAsValidUser() {
        waitClickable(By.id("com.reachout:id/etEmail")).sendKeys("akirraint@gmail.com");
        waitClickable(By.id("com.reachout:id/etPassword")).sendKeys("n12345");
        waitClickable(By.id("com.reachout:id/bEmailLogin")).click();
        return new MainPage();
    }
}

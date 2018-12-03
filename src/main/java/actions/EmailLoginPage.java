package actions;

import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

public class EmailLoginPage extends BasePage {

    @Step
    public MainPage loginAsValidUser() {
        elementWithId("com.reachout:id/etEmail").sendKeys("akirraint@gmail.com");
        elementWithId("com.reachout:id/etPassword").sendKeys("n12345");
        elementWithId("com.reachout:id/bEmailLogin").click();
        return new MainPage();
    }
}

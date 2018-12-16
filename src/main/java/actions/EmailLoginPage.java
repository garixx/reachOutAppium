package actions;

import io.qameta.allure.Step;
import utils.Utils;

public class EmailLoginPage extends BasePage {

    @Step
    public MainPage loginAsValidUser() {
        elementWithId("com.reachout:id/etEmail").sendKeys("akirraint@gmail.com");
        elementWithId("com.reachout:id/etPassword").sendKeys("n12345");
        elementWithId("com.reachout:id/bEmailLogin").click();
        return new MainPage();
    }

    public EmailLoginPage grabScreenshotAs(String s) {
        Utils.putScreenshotToResources(s);
        return this;
    }
}

package actions;

import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import utils.Utils;

import java.io.File;

import static utils.DriverManager.getDriver;

public class EmailLoginPage extends BasePage {

    @Step
    public MainPage loginAsValidUser() {
        elementWithId("com.reachout:id/etEmail").sendKeys("akirraint@gmail.com");
        elementWithId("com.reachout:id/etPassword").sendKeys("n12345");
        elementWithId("com.reachout:id/bEmailLogin").click();
        return new MainPage();
    }

    public EmailLoginPage grabScreenshotAs(String s) {
        Utils.getScreenshotToResources(s);
        return this;
    }
}

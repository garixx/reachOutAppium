package actions;

import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import utils.Utils;

import java.io.File;

import static utils.DriverManager.getDriver;

public class MainPage extends BasePage {

    private SettingsPage settingsPage;

    MainPage() {}

    @Step
    public SettingsPage goToSettingPage() {
        elementWithText("Settings").click();
        return new SettingsPage();
    }

    public MainPage grabScreenshotAs(String s) {
        Utils.getScreenshotToResources(s);
        return this;
    }

}

package actions;

import io.qameta.allure.Step;
import utils.Utils;

public class MainPage extends BasePage {

    private SettingsPage settingsPage;

    MainPage() {}

    @Step
    public SettingsPage goToSettingPage() {
        elementWithText("Settings").click();
        return new SettingsPage();
    }

    public MainPage grabScreenshotAs(String s) {
        Utils.putScreenshotToResources(s);
        return this;
    }

}

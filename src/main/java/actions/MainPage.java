package actions;

import io.qameta.allure.Step;

public class MainPage extends BasePage {

    private SettingsPage settingsPage;

    MainPage() {}

    @Step
    public SettingsPage goToSettingPage() {
        elementWithText("Settings").click();
        return new SettingsPage();
    }

}

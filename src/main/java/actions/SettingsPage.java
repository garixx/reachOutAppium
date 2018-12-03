package actions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import utils.DriverManager;

import java.time.Duration;

public class SettingsPage extends BasePage {

    SettingsPage() {
    }

    @Step
    public SettingsPage findLogoutButton() {
        scrollToText("Logout").click();
        return this;
    }

    @Step
    public LoginPage logout() {
        elementWithId("android:id/button1").click();
        return new LoginPage();
    }


}

package actions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import utils.DriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class MainPage extends BasePage {

    private SettingsPage settingsPage;

    MainPage() {}

    public SettingsPage goToSettingPage() {

        DriverManager.getDriver().findElementByXPath("/hierarchy//android.widget.TextView[contains(@text,'Settings')]").click();

        return new SettingsPage();
    }

}

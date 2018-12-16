package actions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.imagecomparison.SimilarityMatchingResult;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import utils.DriverManager;
import utils.Etalon;
import utils.Utils;

import java.io.File;
import java.io.IOException;

import static org.testng.Assert.assertTrue;
import static utils.DriverManager.getDriver;

public class SettingsPage extends BasePage {

    SettingsPage() {
    }

    @Step
    public SettingsPage scrollToBottom(){
        scrollToText("Logout");
        return this;
    }

    @Step
    public SettingsPage findLogoutButton() throws IOException {
        scrollToText("Logout");
        return this;
    }

    @Step
    public LoginPage logout() {
        scrollToText("Logout").click();
        elementWithId("android:id/button1").click();
        return new LoginPage();
    }

    @Step
    public SettingsPage grabScreenshotAs(String s) {
        Utils.putScreenshotToResources(s);
        return this;
    }

    public SettingsPage scroll() {

        new TouchAction<>(DriverManager.getDriver())
                .longPress(PointOption.point(360, 950))
                .moveTo(PointOption.point(360, 350))
                .release()
                .perform();
        return this;
    }

    @Step
    public SettingsPage compareScreenShotWith(Etalon etalon) throws IOException {

        File screenshot = getDriver().getScreenshotAs(OutputType.FILE);
        SimilarityMatchingResult i = getDriver().getImagesSimilarity(new File(etalon.getValue()), screenshot);

        saveScreenShot();

        assertTrue(i.getScore() > 0.95, "Settings page screenshot has similarity with the etalon image less than 95%");
        return this;
    }


}

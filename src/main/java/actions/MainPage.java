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
    private SupportPage supportPage;
    private NotifyPage notifyPage;
    private ChatPage chatPage;
    private ProfilePage profilePage;
    private SettingsPage settingsPage;

    MainPage() {}

    public SupportPage goToSupportPage() {
        return new SupportPage();
    }

    public NotifyPage goToNotifyPage() {
        return new NotifyPage();
    }

    public ChatPage goToChatPage() {
        return new ChatPage();
    }

    public ProfilePage goToProfilePage() {
        return new ProfilePage();
    }

    public SettingsPage goToSettingPage() throws InterruptedException {
//        List<WebElement> list = DriverManager.getDriver().findElementsByClassName("android.widget.TextView");
//        for (WebElement w:list) {
//            if (w.getText().contains("Settings")) {w.click();
//                System.out.println("----------");}
//
//        }
        //TimeUnit.SECONDS.wait(3);
        DriverManager.getDriver().findElementByXPath("/hierarchy//android.widget.TextView[contains(@text,'Settings')]").click();


//        new TouchAction(DriverManager.getDriver())
//                .press(PointOption.point(100,100))
//                .moveTo(PointOption.point(100, 600))
//                .release()
//                .perform();
        //DriverManager.getDriver().findElementsByXPath("").
        return new SettingsPage();
    }

    public MainPage checkMainPageSections() {
        assertTrue(DriverManager.getDriver().findElementByXPath("//android.widget.TextView[contains(text(),‘Support’)]").isEnabled(), "Support button should be displayed");
        assertTrue(DriverManager.getDriver().findElementByXPath("//android.widget.TextView[contains(text(),‘Notify’)]").isEnabled(), "Notify button should be displayed");
        assertTrue(DriverManager.getDriver().findElementByXPath("//android.widget.TextView[contains(text(),‘Chat’)]").isEnabled(), "Chat button should be displayed");
        assertTrue(DriverManager.getDriver().findElementByXPath("//android.widget.TextView[contains(text(),‘Profile’)]").isEnabled(), "Profile button should be displayed");
        assertTrue(DriverManager.getDriver().findElementByXPath("//android.widget.TextView[contains(text(),‘Settings’)]").isEnabled(), "Settings button should be displayed");
        return this;
    }
}

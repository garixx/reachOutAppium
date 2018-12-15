import actions.LoginPage;
import actions.SettingsPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.DriverManager;
import utils.Etalon;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;
import static utils.DriverManager.getDriver;


@Listeners(MyTestListener.class)
@Epic("Reachout app functionality")
@Feature("As Tester I can check app functionality using native methods and screenshots")
public class LoginTest extends BaseTest{

    @Story("As user I can login & logout with my email")
    @Test(description = "Check login & logout using email")
    public void checkLoginViaEmail() throws IOException {

        new LoginPage()
                .selectEmailLogin()
                .loginAsValidUser()
                .goToSettingPage()
                .findLogoutButton()
                .logout();
    }


    @Story("As User I want app screens displayed according to mockups")
    @Test(description = "Check screens matched to the etalon images")
    public void checkScreenShots() throws IOException {
        new LoginPage()
                .compareScreenShotWith(Etalon.LOGIN_PAGE)
                .selectEmailLogin()
                .loginAsValidUser()
                .goToSettingPage()
                .compareScreenShotWith(Etalon.SETTINGS_PAGE)
                .scrollToBottom()
                .compareScreenShotWith(Etalon.SETTINGS_PAGE_SCROLLED)
                .findLogoutButton()
                .logout();
    }

    @Test
    public void gg() throws InterruptedException {
        SettingsPage s = new LoginPage()
                .selectEmailLogin()
                .loginAsValidUser()
                .goToSettingPage();

        while (true){


            List<WebElement> list = DriverManager.getDriver().findElementsById("com.reachout:id/tvLogout");
            if (list.size() > 0) {list.get(0).click();
                System.out.println("i-----");
            break;} else {
            s.scroll();
            System.out.println("i=");}
        }
    }
}

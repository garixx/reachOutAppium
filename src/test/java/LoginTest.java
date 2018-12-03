import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.DriverManager;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

@Listeners(MyTestListener.class)
@Epic("Log into Reachout app")
@Feature("As User I can login using Email, Google, Facebook")
public class LoginTest extends BaseTest{

//    @Story("As user I can login with my Google account")
//    @Test(description = "Check login using google")
//    public void checkLoginViaGoogle() {
//        new LoginPage()
//                .checkHeaders()
//                .loginViaGoogle()
//                .returnToLoginPageFromGooglePage();
//    }
//
//    @Story("As user I can login with my Facebook account")
//    @Test(description = "Check login using facebook")
//    public void checkLoginViaFacebook() {
//
//        new LoginPage()
//                .loginViaFacebook()
//                .returnToLoginPageFromFacebookPage();
//    }

//    @Story("As user I can login with my email")
//    @Test(description = "Check login using email")
//    public void checkLoginViaEmail() throws InterruptedException {
//
//        new LoginPage()
//                .loginViaEmail()
//                .verifyPage()
//                .loginAsValidUser()
//                //.checkMainPageSections()
//                .goToSettingPage();
//                //.logout();
//    }

//    @Story("As user I can sign up with my email")
//    @Test(description = "Check sign up into app using email")
//    public void checkSingUpViaEmail() {
//
//        new LoginPage()
//                .signUpViaEmail()
//                .returnToLoginPageFromEmailSignupPage();
//
//    }

//    @Story("xpath experiments")
//    @Test
//    public void ccc() {
//        //DriverManager.getDriver().findElementByXPath("/hierarchy//android.widget.TextView[6]").click();
//        DriverManager.getDriver().findElementByXPath("/hierarchy//android.widget.TextView[contains(@text,'Email Login')]").click();
//    }

    @Test
    public void rr() throws InterruptedException {
        //DriverManager.getDriver().findElementByAndroidUIAutomator("new UiSelector().text(\"Email Login\")").click();
        //DriverManager.getDriver().findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.reachout:id/bEmailLogin\")").click();
        resourceId("com.reachout:id/bEmailLogin").click();
        resourceId("com.reachout:id/etEmail").sendKeys("akirraint@gmail.com");
        resourceId("com.reachout:id/etPassword").sendKeys("n12345");
        resourceId("com.reachout:id/bEmailLogin").click();
        TimeUnit.SECONDS.sleep(5);





    }

    private WebElement resourceId(String s) {
        return DriverManager.getDriver().findElementByAndroidUIAutomator("new UiSelector().resourceId(\"" + s + "\")");
    }


}

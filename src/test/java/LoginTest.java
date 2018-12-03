import actions.LoginPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
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

    @Story("As user I can login with my email")
    @Test(description = "Check login using email")
    public void checkLoginViaEmail() throws InterruptedException {

        new LoginPage()
                .loginViaEmail()
                .loginAsValidUser()
                .goToSettingPage();

        TimeUnit.SECONDS.sleep(5);
    }
}

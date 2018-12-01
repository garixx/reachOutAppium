import actions.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Listeners(MyTestListener.class)
@Epic("Log into Reachout app")
@Feature("As User I can login using Email, Google, Facebook")
public class LoginTest extends BaseTest{


    @Description("Check login using google")
    @Story("As user I can login with my Google account")
    @Test
    public void checkLoginViaGoogle() {
        new LoginPage()
                .checkHeaders()
                .loginViaGoogle()
                .returnToLoginPageFromGoogle()
                .assertAll();
    }

    @Description("Check login using facebook")
    @Story("As user I can login with my Facebook account")
    @Test
    public void checkLoginViaFacebook() throws InterruptedException {

        new LoginPage()
                .checkHeaders()
                .loginViaFacebook()
                .returnToLoginPageFromFacebook()
                .assertAll();
    }

}

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

    @Story("As user I can login with my Google account")
    @Test(description = "Check login using google")
    public void checkLoginViaGoogle() {
        new LoginPage()
                .checkHeaders()
                .loginViaGoogle()
                .returnToLoginPageFromGooglePage();
    }

    @Story("As user I can login with my Facebook account")
    @Test(description = "Check login using facebook")
    public void checkLoginViaFacebook() {

        new LoginPage()
                .loginViaFacebook()
                .returnToLoginPageFromFacebookPage();
    }

    @Story("As user I can login with my email")
    @Test(description = "Check login using email")
    public void checkLoginViaEmail() {

        new LoginPage()
                .loginViaEmail()
                .verifyPage()
                .returnToLoginPageFromEmailLoginPage();
    }

    @Story("As user I can sign up with my email")
    @Test(description = "Check sign up into app using email")
    public void checkSingUpViaEmail() {

        new LoginPage()
                .signUpViaEmail()
                .returnToLoginPageFromEmailSignupPage();

    }

}

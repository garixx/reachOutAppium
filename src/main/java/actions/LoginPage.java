package actions;

import io.appium.java_client.imagecomparison.SimilarityMatchingResult;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import utils.Etalon;
import utils.Utils;

import java.io.File;
import java.io.IOException;

import static org.testng.Assert.assertTrue;
import static utils.DriverManager.getDriver;

public class LoginPage extends BasePage{

    @Step
    public EmailLoginPage selectEmailLogin() {
        elementWithId("com.reachout:id/bEmailLogin").click();
        return new EmailLoginPage();
    }

    @Step
    public LoginPage compareScreenShotWith(Etalon etalon) throws IOException {

        File screenshot = getDriver().getScreenshotAs(OutputType.FILE);
        SimilarityMatchingResult i = getDriver().getImagesSimilarity(new File(etalon.getValue()), screenshot);

        saveScreenShot();

        assertTrue(i.getScore() > 0.95, "Login page screenshot has similarity with the etalon image less than 95%");
        return this;
    }

    public LoginPage grabScreenshotAs(String s) {
        Utils.putScreenshotToResources(s);
        return this;
    }

}

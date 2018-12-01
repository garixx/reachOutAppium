import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.Augmenter;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.DriverManager;

public class MyTestListener extends BaseTest implements ITestListener {

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        saveAppScreenShot();
    }

    @Attachment(value = "App screenshot", type = "image/png")
    public byte[] saveAppScreenShot() {
        return DriverManager.getDriver().getScreenshotAs(OutputType.BYTES);
    }

}

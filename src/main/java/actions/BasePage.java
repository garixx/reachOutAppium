package actions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import utils.DriverManager;

import java.io.File;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static utils.DriverManager.getDriver;

public class BasePage {

    protected static final Logger LOGGER = Logger.getLogger(BasePage.class.getName());
    protected Level level = Level.INFO;

    protected WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 30);
    protected WebElement we;

    protected WebElement elementWithId(String s) {
        return DriverManager.getDriver().findElementByAndroidUIAutomator("new UiSelector().resourceId(\"" + s + "\")");
    }

    protected WebElement elementWithText(String s) {
        return DriverManager.getDriver().findElementByAndroidUIAutomator("new UiSelector().text(\"" + s + "\")");
    }

    protected WebElement scrollToText(String s) {
        return DriverManager.getDriver()
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                        ".getChildByText(new UiSelector().className(\"android.widget.TextView\"), \"" + s + "\")");
    }
    
    protected WebElement scrollToText2(String s) {
        return DriverManager.getDriver()
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                        ".getChildByText(new UiSelector().className(\"android.widget.TextView\"), \"" + s + "\")");
    }
}

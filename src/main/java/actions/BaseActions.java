package actions;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import utils.DriverManager;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseActions {

    protected static final Logger LOGGER = Logger.getLogger(BaseActions.class.getName());
    protected Level level = Level.INFO;

    protected WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 30);
    protected SoftAssert softAssert = new SoftAssert();

    protected WebElement waitClickable(By element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected WebElement waitVisible(By element) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}

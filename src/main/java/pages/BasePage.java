package pages;

import io.appium.java_client.AppiumDriver;
import utils.DriverManager;

public class BasePage {
    protected AppiumDriver driver = DriverManager.getDriver();
}

package actions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import utils.DriverManager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseActions {

    protected static final Logger LOGGER = Logger.getLogger(BaseActions.class.getName());
    protected Level level = Level.INFO;

    protected WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 30);
    protected SoftAssert softAssert = new SoftAssert();
}

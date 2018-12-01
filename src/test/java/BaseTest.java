import org.testng.annotations.*;
import utils.DriverManager;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseTest {

    protected static final Logger LOGGER = Logger.getLogger(BaseTest.class.getName());
    protected Level level = Level.INFO;

    @BeforeTest
    public void setUpTest() throws MalformedURLException {
        DriverManager.setDriver();
        LOGGER.log(level, "test started");
    }

    @BeforeMethod
    public void prepareActivity() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
    }

    @AfterTest
    public void dropDownTest() {
        DriverManager.getDriver().quit();
        LOGGER.log(level, "test finished");

    }

    @BeforeSuite
    public void suiteStart() throws MalformedURLException {
        LOGGER.log(level, "suite started");
    }

    @AfterSuite
    public void suiteFinish() {
        LOGGER.log(level, "suite started");
    }
}

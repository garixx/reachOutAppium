import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseTest {

    protected static final Logger LOGGER = Logger.getLogger(BaseTest.class.getName());
    protected Level level = Level.INFO;

    @BeforeTest
    public void setUpTest() {
        LOGGER.log(level, "test started");
    }

    @AfterTest
    public void dropDownTest() {
        LOGGER.log(level, "test finished");
    }

    @BeforeSuite
    public void suiteStarted() {
        LOGGER.log(level, "suite started");
    }

    @AfterSuite
    public void suiteFinished() {
        LOGGER.log(level, "suite started");
    }
}

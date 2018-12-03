package actions;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import utils.DriverManager;

public class EmailLoginPage extends BasePage {

    @Step
    public MainPage loginAsValidUser() {
        elementWithXpath("/hierarchy//android.widget.EditText[1]").sendKeys("akirraint@gmail.com");
        elementWithXpath("/hierarchy//android.widget.EditText[2]").sendKeys("n12345");
        DriverManager.getDriver().hideKeyboard();
        elementWithXpath("/hierarchy//android.widget.TextView[3]").click();
        return new MainPage();
    }
}

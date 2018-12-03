package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SettingsPage extends BasePage {

    SettingsPage() {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.reachout:id/tvTitle")));
        assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.reachout:id/tvTitle"))).getText(), "Settings",
                "Settings header should be displayed if Setting Page is opened");
    }

    public LoginPage logout() {
        elementWithXpath("com.reachout:id/tvLogout").click();
        elementWithXpath("android:id/button1").click();
        return new LoginPage();
    }


}

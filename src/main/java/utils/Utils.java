package utils;

import actions.LoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;

import static utils.DriverManager.getDriver;

public class Utils {
    public static boolean putScreenshotToResources(String s) {
        try {
            File screenshot = getDriver().getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("src/main/resources/" + s));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static AndroidDriver driver;

    public static AndroidDriver setDriver() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setPlatform(Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
        caps.setCapability("appPackage","com.reachout");
        caps.setCapability("appActivity", "com.cleveroad.reachout.ui.activity.SplashActivity");
        //caps.setCapability(MobileCapabilityType.APP,new File("src\\main\\resources\\reachout.apk"));
        caps.setCapability("deviceName","emulator-5554");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        driver = new AndroidDriver(new URL("http://192.168.42.9:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        return driver;
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

}


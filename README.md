# ReachOutAppium
Example appium test suite for ReachOut social network android app <br/>
Maven + Appium java client + TestNG + Allure reporting
# How to run
Before runnung you should have:
- Java 8 JDK installed
- JAVA_HOME variable set
- ANDROID SDK installed
- ANDROID_HOME variable set
- android emulator launched or a real device connected with enabled USB_DEBUGGING
- cmd> adb devices returned not empty connected devices list. set your device or emulator config at DriverManager.java
- nodejs installed
- npm install -g appium executed (appium installed)
- cmd>appium executed (appium up and listening)

# Locators hunting

With Appium Desktop:
- Download and install Appium Desktop from official site
- Ensure cmd>adb devices returned not empty connected devices list
- Run Appium Desktop
- Start Appium server <br/>
  ![alt text](https://raw.githubusercontent.com/garixx/reachOutAppium/master/Screenshot_17.jpg)

- Run new session <br/>
  ![alt text](https://raw.githubusercontent.com/garixx/reachOutAppium/master/Screenshot_18.jpg)

- Connect to your device or emulator using capabilities: <br/>
  ![alt text](https://raw.githubusercontent.com/garixx/reachOutAppium/master/Screenshot_19.jpg)
  
- Select elements at device and watch locators info

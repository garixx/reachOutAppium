package actions;

public class MainPage extends BasePage {
    private SupportPage supportPage;
    private NotifyPage notifyPage;
    private ChatPage chatPage;
    private ProfilePage profilePage;
    private SettingsPage settingsPage;

    MainPage() {}

    public SupportPage goToSupportPage() {
        return new SupportPage();
    }

    public NotifyPage goToNotifyPage() {
        return new NotifyPage();
    }

    public ChatPage goToChatPage() {
        return new ChatPage();
    }

    public ProfilePage goToProfilePage() {
        return new ProfilePage();
    }

    public SettingsPage goToSettingPage() {

        elementWithText("Settings").click();
        return new SettingsPage();
    }

}
